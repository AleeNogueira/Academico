import classes.Funcionario;
import controladores.Arquivo;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios = Arquivo.LerArquivo("src/arquivos/lista_funcionarios.csv");
        int contador = 0;
        System.out.println("depois da leitura");
        for (Funcionario f2 : funcionarios) {
            contador++;
            System.out.print(contador + " - ");
            System.out.println(f2.getNome());
        }
    }
}
