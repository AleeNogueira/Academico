import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.inserirInicio(10);
        lista.inserirInicio(20);
        lista.inserirInicio(30);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o número que você quer procurar: ");
        int valorBusca = sc.nextInt();
        if(lista.buscar(valorBusca) == true){
            lista.imprimir();
            System.out.println("o Valor tem na lsita");
        }else{
            lista.imprimir();
            System.out.println("não existe o valor na lista");
        }

        System.out.printf("Digite o valor que deseja remover: ");
        int valorRemover = sc.nextInt();
        lista.remover(valorRemover);
        
        sc.close();

        lista.imprimir();


    }
}