package Aula02ListaEncadeadaSimples;

public class Main {

    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        lista.inserirInicio(11);
        lista.insercaoOrdenada(10);
        lista.insercaoOrdenada(12);
        lista.insercaoOrdenada(13);
        lista.insercaoOrdenada(9);
        lista.insercaoOrdenada(20);
        lista.inserirInicio(20);
        lista.imprimir();
        lista.ahValoresDuplicados();
        lista.contEhParOuImpar();
        lista.inserirInciosSegLista(30);
        lista.inserirInciosSegLista(40);
        lista.concatenarListas();
        lista.imprimir();
    }
}
