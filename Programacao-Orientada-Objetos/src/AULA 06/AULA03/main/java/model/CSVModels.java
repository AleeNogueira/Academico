package model;

public interface CSVModels {
    //Metodos abstratos
    public abstract void fromCSV(String linha) throws NumberFormatException;
    public abstract String toCSV();

}
