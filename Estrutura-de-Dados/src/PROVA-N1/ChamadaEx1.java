import java.util.Scanner;

public class ChamadaEx1 {
    public ChamadaEx1(){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        System.out.println("A lista tem: "+ lista.tamList()+" nós na lista");

        Scanner sc = new Scanner(System.in);
        lista.imprmirLista();
        System.out.printf("Digite o numero que você quer ver a quantidades de nós que ele é maior: ");
        int n = sc.nextInt();
        System.out.println("Ele é maior que: "+lista.quantNosMaiorN(n)+" nós na lista");

        lista.imprmirLista();
        System.out.printf("Você deseja remover qual ocorrência?\nDigite: ");
        n = sc.nextInt();
        lista.removerOcorrencia(n);
    }
}
