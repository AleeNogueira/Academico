class Livro {
    private String tituloLivro;
    private String nomeAutor;
    private int anoPublicacao;
    private int numeroPaginas;

    public Livro() {}

    public Livro(String tituloLivro, String nomeAutor, int anoPublicacao, int numeroPaginas) {
        this.tituloLivro = tituloLivro;
        this.nomeAutor = nomeAutor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return tituloLivro + " - " + nomeAutor + " (" + anoPublicacao + "), " + numeroPaginas + " páginas";
    }
}
