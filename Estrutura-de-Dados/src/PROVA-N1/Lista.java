import java.util.ArrayList;

public class Lista {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public Lista(){
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
    }
    public void imprmirLista(){
        System.out.println(list);
    }
    public void inserirFimLista(int n){
        list.addLast(n);
        imprmirLista();
    }
    public void buscaLista(int n){
        boolean tem = false;
        for(int i = 0; i<list.size(); i++){
            if(n == list.get(i)){
                tem = true;
            }
        }
        if(tem == true){
            for(int i = 0; i<list.size(); i++){
                if(n == list.get(i)){
                    System.out.println("O numero "+n+" aparece primeiramente na posição "+i);
                }
            }
        }else{
            System.out.println("Tem na lista não man ");
        }
    }
}
