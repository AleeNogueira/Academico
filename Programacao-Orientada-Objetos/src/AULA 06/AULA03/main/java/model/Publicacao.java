package model;

public abstract class Publicacao implements CSVModels{
    private String titulo;
    private int ano;
    private int numeroPaginas;

    public Publicacao() {}

    public Publicacao(String titulo, int ano, int numeroPaginas) {
        this.titulo = titulo;
        this.ano = ano;
        this.numeroPaginas = numeroPaginas;
    }


    //Getters e setter
    public void setAno(int ano) { this.ano = ano; }
    public int getAno() { return ano; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }
}
