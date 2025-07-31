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
    public boolean buscar(int valor){
        No valorBusca = new No(valor);
        if(inicio != valorBusca){
            while (inicio != null){
                if(inicio == valorBusca){
                    return true;
                }
                inicio = inicio.proximo;
            }

            return false;
        }
        return true;
    }
    public void remover(int valor){
        No removerValor = new No(valor);
        if(inicio == removerValor){
            inicio = null;
        }else{
            while (inicio != null){
                if(inicio == removerValor){
                    inicio = null;
                }
                inicio = inicio.proximo;
            }
        }
    }


    public void imprimir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}
