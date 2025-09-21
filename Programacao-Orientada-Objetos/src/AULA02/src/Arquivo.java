import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

class Arquivo{

    public static ArrayList<Livro> lerCSV(String nomeArquivo){

        ArrayList<Livro> listaLivros = new ArrayList<>();

        try (BufferedReader leitor = abrir(nomeArquivo)) {
            String cabecalho = leitor.readLine();
            String linhaAtual;
            int numeroLinha = 1;
            while ((linhaAtual = leitor.readLine()) != null) {
                numeroLinha++;
                if (linhaAtual.isBlank()) continue;
                String[] partes = linhaAtual.split(",");
                if (partes.length < 4) {
                    System.err.println("Linha ignorada (#" + numeroLinha + "): " + linhaAtual);
                    continue;
                }
                int numeroPaginas = Integer.parseInt(partes[partes.length - 1].trim());
                int anoPublicacao = Integer.parseInt(partes[partes.length - 2].trim());
                String nomeAutor  = partes[partes.length - 3].trim();
                String tituloLivro = String.join(",", Arrays.asList(partes).subList(0, partes.length - 3)).trim();

                listaLivros.add(new Livro(tituloLivro, nomeAutor, anoPublicacao, numeroPaginas));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + nomeArquivo);
            System.err.println("Working dir: " + Paths.get("").toAbsolutePath());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Falha ao ler '" + nomeArquivo + "': " + e.getMessage());
        }
        return listaLivros;
    }

    private static BufferedReader abrir(String nomeArquivo) throws IOException {

        InputStream streamEntrada = Arquivo.class.getClassLoader().getResourceAsStream(nomeArquivo);
        if (streamEntrada != null) {
            return new BufferedReader(new InputStreamReader(streamEntrada, StandardCharsets.UTF_8));
        }
        return Files.newBufferedReader(Paths.get(nomeArquivo), StandardCharsets.UTF_8);
    }

    public static void escreverCSV(String caminhoArquivo, List<Livro> listaLivros) {
        try (BufferedWriter escritor = Files.newBufferedWriter(Paths.get(caminhoArquivo), StandardCharsets.UTF_8)) {
            escritor.write("titulo,autor,ano,paginas\n");
            for (Livro livro : listaLivros) {
                escritor.write(String.format("%s,%s,%d,%d%n",
                        livro.getTituloLivro(), livro.getNomeAutor(), livro.getAnoPublicacao(), livro.getNumeroPaginas()));
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever '" + caminhoArquivo + "': " + e.getMessage());
        }
    }
}