import java.util.Scanner;

public class ChamadaEx2 {

    public ChamadaEx2() {
        System.out.println("ESSA É A QUESTÃO 2 DA PROVA \n \n ======================== \n");
        Lista lista = new Lista();
        lista.imprmirLista();
        lista.inserirFimLista(14);


        Scanner sc = new Scanner(System.in);
        System.out.printf("Qual número deseja inserir no fim da lista?\nDigite: ");
        int n = sc.nextInt();
        lista.inserirFimLista(n);
        System.out.printf("Qual número deseja buscar na lista?\nDigite: ");
        n = sc.nextInt();
        lista.buscaLista(n);
        sc.close();

    }
}
