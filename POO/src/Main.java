import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();
        funcionario f = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f1 = new funcionario("QA", 2000, "Pedro", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 2000, "M");
        funcionario f3 = new funcionario("QA", 2000, "Joaquin", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 2000, "M");
        arquivo c = new arquivo();
        funcionarios = c.LerArquivo("/Users/Gustavo/Documents/projetos java/aula1/src/lista_funcionarios.csv");
        int contador = 0;
        System.out.println("depois da leitura");
        for (funcionario f2 : funcionarios) {
            contador++;
            System.out.print(contador + " - ");
            System.out.println(f2.getNome());
        }

    }
    }
3