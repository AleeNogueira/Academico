package model;

public class Revista extends Publicacao {
    private String editor;
    private int mes;

    public Revista() {
        super();
    }

    public Revista(String titulo, String editor, int mes, int ano, int numeroPaginas) {
        super(titulo, ano, numeroPaginas);
        this.editor = editor;
        this.mes = mes;
    }

    //GETS SETS
    public String getEditor() { return editor; }
    public void setEditor(String editor) { this.editor = editor; }
    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    //FORMATO CSV
    //titulo,editor, mes,ano,numero_paginas
    @Override
    public void fromCSV(String linha) throws NumberFormatException {
        if (linha == null) return;

        linha = linha.trim();
        if (linha.isEmpty()) return;

        String[] cols = linha.split(",");
        if (cols.length != 5) return; // linha incompleta; ignora

        super.setTitulo(cols[0].trim());
        this.editor = cols[1].trim();
        this.mes = Integer.parseInt(cols[2].trim());
        super.setAno(Integer.parseInt(cols[3].trim()));
        super.setNumeroPaginas(Integer.parseInt(cols[4].trim()));
    }

    //FORMATO CSV
    //titulo,editor, mes,ano,numero_paginas
    @Override
    public String toCSV() {
        return super.getTitulo() + "," + this.getEditor() + "," + this.mes + "," + super.getAno() + "," + super.getNumeroPaginas();
    }
}