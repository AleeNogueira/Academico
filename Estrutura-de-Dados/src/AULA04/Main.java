import Classes.ProcessadorArquivos;

public class Main {
    public static void main(String[] args) {
        ProcessadorArquivos proc = new ProcessadorArquivos();

        proc.processarArquivo("src/Arquivos/arquivo.txt");

        System.out.println("Pilha (linhas ímpares):");
        while (!proc.getPilha().isEmpty()) {
            System.out.print(proc.getPilha().pop());
        }

        System.out.println("\n\nFila (linhas pares):");
        while (!proc.getFila().isEmpty()) {
            System.out.print(proc.removerDaFila());
        }
    }
}