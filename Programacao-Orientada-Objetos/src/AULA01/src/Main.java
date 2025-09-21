import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivros = Arquivo.lerCSV("Livros.csv");

        Biblioteca biblioteca = new Biblioteca(listaLivros);

        System.out.println("Lista de livros:");
        for (String tituloLivro : biblioteca.listarPorNome()) {
            System.out.println("- " + tituloLivro);
        }

        System.out.println("\nMédia de páginas: " + biblioteca.mediaPaginas());

        ArrayList<Livro> livrosApos2000 = biblioteca.publicadosApos(2000);
        Arquivo.escreverCSV("LivrosApos2000.csv", livrosApos2000);
        System.out.println("\nArquivo 'LivrosApos2000.csv' gerado com sucesso!");
    }
}