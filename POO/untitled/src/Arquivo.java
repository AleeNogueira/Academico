import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

class Arquivo{

    public static ArrayList<Livro> lerCSV(String nome){

        ArrayList<Livro> livros = new ArrayList<>();

        try (BufferedReader br = abrir(nome)) {
            String header = br.readLine();
            String linha;
            int n = 1;
            while ((linha = br.readLine()) != null) {
                n++;
                if (linha.isBlank()) continue;
                String[] p = linha.split(",");
                if (p.length < 4) {
                    System.err.println("Linha ignorada (#" + n + "): " + linha);
                    continue;
                }
                int paginas = Integer.parseInt(p[p.length - 1].trim());
                int ano     = Integer.parseInt(p[p.length - 2].trim());
                String autor  = p[p.length - 3].trim();
                String titulo = String.join(",", Arrays.asList(p).subList(0, p.length - 3)).trim();

                livros.add(new Livro(titulo, autor, ano, paginas));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + nome);
            System.err.println("Working dir: " + Paths.get("").toAbsolutePath());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Falha ao ler '" + nome + "': " + e.getMessage());
        }
        return livros;
    }

    private static BufferedReader abrir(String nome) throws IOException {

        InputStream in = Arquivo.class.getClassLoader().getResourceAsStream(nome);
        if (in != null) {
            return new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        }
        return Files.newBufferedReader(Paths.get(nome), StandardCharsets.UTF_8);
    }

    public static void escreverCSV(String caminho, List<Livro> livros) {
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(caminho), StandardCharsets.UTF_8)) {
            bw.write("titulo,autor,ano,paginas\n");
            for (Livro l : livros) {
                bw.write(String.format("%s,%s,%d,%d%n",
                        l.getTitulo(), l.getAutor(), l.getAno(), l.getNumeroPaginas()));
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever '" + caminho + "': " + e.getMessage());
        }
    }
}