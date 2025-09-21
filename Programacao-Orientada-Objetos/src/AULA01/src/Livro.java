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

    public String getTitulo() { return tituloLivro; }
    public void setTitulo(String tituloLivro) { this.tituloLivro = tituloLivro; }

    public String getAutor() { return nomeAutor; }
    public void setAutor(String nomeAutor) { this.nomeAutor = nomeAutor; }

    public int getAno() { return anoPublicacao; }
    public void setAno(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    @Override
    public String toString() {
        return tituloLivro + " - " + nomeAutor + " (" + anoPublicacao + "), " + numeroPaginas + " páginas";
    }
}
