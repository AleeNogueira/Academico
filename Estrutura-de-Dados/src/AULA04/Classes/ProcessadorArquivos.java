package Classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class ProcessadorArquivos {
    private Stack<Character> pilha = new Stack<>();
    private ArrayList<Character> fila = new ArrayList<>();

    public void processarArquivo(String caminho) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            int numeroLinha = 1;

            while ((linha = reader.readLine()) != null) {
                for (char c : linha.toCharArray()) {
                    if (numeroLinha % 2 != 0) {
                        pilha.push(c);   // linhas ímpares → pilha
                    } else {
                        fila.add(c);     // linhas pares → adiciona no "fim" da fila
                    }
                }
                numeroLinha++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stack<Character> getPilha() {
        return pilha;
    }

    public ArrayList<Character> getFila() {
        return fila;
    }

    // remove e retorna o primeiro elemento da "fila"
    public Character removerDaFila() {
        if (!fila.isEmpty()) {
            return fila.remove(0); // simula FIFO (menos eficiente)
        }
        return null;
    }

}
