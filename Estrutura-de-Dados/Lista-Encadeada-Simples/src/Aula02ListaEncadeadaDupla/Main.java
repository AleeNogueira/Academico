package Aula02ListaEncadeadaDupla;

public class Main {
    public static void main(String[] args){
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.inserirIncio(10);
        listaLigada.inserirIncio(5);
        listaLigada.inserirFim(10);
        System.out.println(listaLigada.ehPalindromo());
        listaLigada.imprimirReverso();
        listaLigada.imprimirReverso();

    }
}
