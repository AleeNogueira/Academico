package model;


public class Livro extends Publicacao {
    private String autor;

    public Livro() {
        super();
    }

    public Livro(String titulo, String autor, int ano, int numeroPaginas) {
        super(titulo, ano, numeroPaginas);
        this.autor = autor;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    //FORMATO CSV
    //titulo,autor,ano,numero_paginas
    @Override
    public void fromCSV(String linha) {
        if (linha == null) return;

        linha = linha.trim();
        if (linha.isEmpty()) return;

        String[] cols = linha.split(",");
        if (cols.length != 4) return; // linha incompleta; ignora

        super.setTitulo(cols[0].trim());
        this.autor = cols[1].trim();
         super.setAno(Integer.parseInt(cols[2].trim()));
         super.setNumeroPaginas(Integer.parseInt(cols[3].trim()));
    }


    //FORMATO CSV
    //titulo,autor,ano,numero_paginas
    @Override
    public String toCSV() {
        return super.getTitulo() + "," + this.getAutor() + "," + super.getAno() + "," + super.getNumeroPaginas();
    }
}
