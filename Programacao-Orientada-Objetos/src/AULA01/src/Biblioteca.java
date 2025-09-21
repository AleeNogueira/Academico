import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Livro> listaLivros;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void adicionar(Livro livro) {
        listaLivros.add(livro);
    }

    public ArrayList<String> listarPorNome() {
        ArrayList<String> listaTitulos = new ArrayList<>();
        for (Livro livro : listaLivros) {
            listaTitulos.add(livro.getTitulo());
        }
        return listaTitulos;
    }

    public double mediaPaginas() {
        if (listaLivros.isEmpty()) return 0;
        int somaPaginas = 0;
        for (Livro livro : listaLivros) {
            somaPaginas += livro.getNumeroPaginas();
        }
        return (double) somaPaginas / listaLivros.size();
    }

    public ArrayList<Livro> publicadosApos(int anoLimite) {
        ArrayList<Livro> livrosFiltrados = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAno() > anoLimite) livrosFiltrados.add(livro);
        }
        return livrosFiltrados;
    }

    public ArrayList<Livro> getLivros() {
        return listaLivros;
    }
}
