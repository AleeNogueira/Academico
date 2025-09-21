import java.util.Stack;

public class Tarefa {
    Stack<String> pilha;
    public Tarefa(){
        pilha = new Stack<String>();
    }
    public void inserirTarefa(String tarefa){
        pilha.push(tarefa);
    }
    public void obterProximaTarefa(){
        if(!pilha.empty()){
            System.out.println("Tarefa atual: "+pilha.peek() );
        }else{
            System.out.println("Pilha vazia");
        }
    }

}
