package Aula02ListaEncadeadaDupla;

public class ListaLigada {
    private No inicio;
    private No fim;

    public ListaLigada(){
        this.inicio = null;
        this.fim = null;
    }
    public void inserirFim(int valor){
        No novo = new No(valor);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }else{
            fim.proximo = novo;
            novo.anterior =  fim;
            fim = novo;
        }
    }
    public void inserirIncio(int valor){
        No novo = new No(valor);
        if(inicio == null){
            inicio = novo;
        }else{
            novo.proximo = inicio;
            novo.anterior = inicio.anterior;
            inicio = novo;
        }
    }
    public void imprimirReverso(){
        if(inicio == null){
            System.out.println("Lista vazia");
        }else{
            No atual = inicio;
            while (atual.proximo != null){
                atual = atual.proximo;
            }
            while (atual.anterior != null){
                System.out.printf("<-"+atual);
                atual = atual.anterior;
            }
        }
    }
    public void remover(int valor){
        No atual = inicio;
        if(inicio.valor == valor){
            inicio = inicio.proximo;
            inicio.proximo.anterior = inicio.anterior;
        }else{
            while (atual != null){
                if(atual.valor == valor){
                    atual = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                    break;
                }
                atual = atual.proximo;
            }
        }
    }
    public boolean ehPalindromo(){
        No comeco = inicio;
        No ultimo = fim;
        while (comeco != null){
            if(comeco == ultimo){
                return false;
            }
            ultimo = ultimo.anterior;
            comeco = comeco.proximo;
        }
        return true;
    }

}
