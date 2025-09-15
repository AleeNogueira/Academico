class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int numeroPaginas;

    public Livro() {}

    public Livro(String titulo, String autor, int ano, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + ano + "), " + numeroPaginas + " páginas";
    }
}