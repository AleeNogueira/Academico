public class ListaLigada {
    private No inicio;

    public ListaLigada(){
        this.inicio = null;
    }


    public void inserirInicio(int valor){
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }
    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public boolean buscar(int valor){
        No valorBusca = new No(valor);
        No atual = inicio;
        if(atual.valor != valorBusca.valor){
            while (atual != null){
                if(atual.valor == valorBusca.valor){
                    return true;
                }
                atual = atual.proximo;
            }

            return false;
        }
        return true;
    }
    public void remover(int valor){
        No atual = inicio;
        No anterior = atual.proximo;

        if(inicio.valor == valor ){
            inicio = inicio.proximo;
        }


        while(atual != null){
            if(atual.valor == valor){
                anterior.proximo = atual.proximo;

            }
            anterior = atual;
            atual = atual.proximo;

        }
    }




}
