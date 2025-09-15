import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
    }

    public ArrayList<String> listarPorNome() {
        ArrayList<String> nomes = new ArrayList<>();
        for (Livro l : livros) {
            nomes.add(l.getTitulo());
        }
        return nomes;
    }

    public double mediaPaginas() {
        if (livros.isEmpty()) return 0;
        int soma = 0;
        for (Livro l : livros) {
            soma += l.getNumeroPaginas();
        }
        return (double) soma / livros.size();
    }

    public ArrayList<Livro> publicadosApos(int ano) {
        ArrayList<Livro> filtrados = new ArrayList<>();
        for (Livro l : livros) {
            if (l.getAno() > ano) filtrados.add(l);
        }
        return filtrados;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}