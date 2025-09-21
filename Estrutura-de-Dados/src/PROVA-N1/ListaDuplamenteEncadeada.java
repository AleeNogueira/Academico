import java.util.LinkedList;

public class ListaDuplamenteEncadeada {
    LinkedList<Integer> list = new LinkedList<Integer>();

    public ListaDuplamenteEncadeada(){
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
    }
    public void imprmirLista(){
        System.out.println(list);
    }

    public int tamList(){
        return list.size();
    }

    public int quantNosMaiorN(int n){
        int cont  = 0;
        for(int i = 0; i<list.size(); i++){
            if(n > list.get(i)){
                cont ++;
            }
        }
        return cont;
    }

    public void removerOcorrencia(int n ){
        for (int i = 0; i<list.size(); i++){
            if(list.get(i) == n){
                list.remove(i);
            }
        }
        imprmirLista();
    }


}
