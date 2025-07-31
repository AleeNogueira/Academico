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
        No removerValor = new No(valor);
        No atual = inicio;
        while (atual != null){
            if(atual.valor == removerValor.valor){
                atual = null;
            }
            atual = inicio.proximo;
        }
    }




}
