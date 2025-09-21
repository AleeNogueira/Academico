import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tarefa pilhaTarefa = new Tarefa();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.printf("Bem vindo a PILHA DE TAREFAS\n"+
                    "Digite 1 para adicionar uma nova tarefa\n"+
                    "Ditite 2 para ir para a próxima tarefa\n" +
                    "Se deja sair digite 3 \n"+
                    "Digite: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String nova = sc.nextLine();
                    pilhaTarefa.inserirTarefa(nova);
                    System.out.println("Tarefa adicionada com sucesso!\n\n");
                    break;

                case 2:
                    System.out.println("obtendo proxima tarefa");
                    pilhaTarefa.obterProximaTarefa();
                    break;

                case 3:
                    System.out.println("Saindo... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }while (opcao > 0 || opcao <4);

    }
}