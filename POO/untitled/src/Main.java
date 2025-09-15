import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = Arquivo.lerCSV("Livros.csv");

        Biblioteca biblioteca = new Biblioteca(livros);

        System.out.println("Lista de livros:");
        for (String nome : biblioteca.listarPorNome()) {
            System.out.println("- " + nome);
        }

        System.out.println("\nMédia de páginas: " + biblioteca.mediaPaginas());

        ArrayList<Livro> apos2000 = biblioteca.publicadosApos(2000);
        Arquivo.escreverCSV("LivrosApos2000.csv", apos2000);
        System.out.println("\nArquivo 'LivrosApos2000.csv' gerado com sucesso!");
    }
}