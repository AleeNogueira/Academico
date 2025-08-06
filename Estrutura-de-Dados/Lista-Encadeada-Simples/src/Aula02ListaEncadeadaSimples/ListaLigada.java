package Aula02ListaEncadeadaSimples;

public class ListaLigada {
    private  No inicio;
    private No incioSegLista;

    public ListaLigada(){
        this.inicio = null;
        this.incioSegLista = null;
    }
    public void inserirInicio(int valor){
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }
    public void inserirInciosSegLista(int valor){
        No novo = new No(valor);
        novo.proximo = incioSegLista;
        incioSegLista = novo;
    }
    public void imprimir(){
        No atual = inicio;
        while (atual != null){
            System.out.printf(atual.valor+"->");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
    /*Implemente uma lista encadeada simples que insira elementos de forma ordenada (crescente).
    Exemplo de inserção: 7 → 2 → 5 → 4 → Resultado: 2 → 4 → 5 → 7*/
    public void insercaoOrdenada(int valor){
        No novo = new No(valor);
        No atual = inicio;
        if(inicio == null || novo.valor < inicio.valor ){
            novo.proximo = inicio;
            inicio = novo;
        }else{
            while (atual.proximo != null && atual.proximo.valor < valor){
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;

        }
    }

    /*Crie um metodo que percorra a lista e verifique se há valores duplicados.
    Se houver, exiba-os na tela.*/

    public void ahValoresDuplicados(){
        No atual = inicio;
        No valorCompara = inicio;
        if(atual.valor == valorCompara.valor){
            System.out.println("Os valores:"+atual.valor+"e"+ valorCompara.valor+" são iguais");
        }else{
            while (atual != null){
                while (valorCompara != null){
                    if(atual.valor == valorCompara.valor){
                        System.out.println("Os valores:"+atual.valor+" e "+valorCompara.valor+" são iguais");
                    }
                    valorCompara = valorCompara.proximo;
                }
                    valorCompara = inicio;
                    atual = atual.proximo;
            }
        }

    }
    /*Implemente um metodo que percorra a lista e conte quantos valores
    são pares e quantos são ímpares.*/
    public void contEhParOuImpar(){
        No atual = inicio;
        int contPar = 0;
        int contImpar = 0;
        while (atual != null){
            if(atual.valor %2 == 0){
                contPar ++;
            }else{
                contImpar ++;
            }
            atual = atual.proximo;
        }
        System.out.println("Existem "+contPar+" valores pares");
        System.out.println("Existem "+contImpar+" valores impares");
    }
    /*Implemente um método que junte duas listas encadeadas simples no final da primeira.*/
    public void concatenarListas(){
        No atual = inicio;
        if(inicio == null){
            inicio = incioSegLista;
        }
        while (atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = incioSegLista;

    }

}
