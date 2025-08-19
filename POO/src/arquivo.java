import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class arquivo {
    // atributos

    public arquivo() {
    }

    // metodos
    public static void CriarArquivo(String ARQUIVO) throws IOException {
        new FileWriter(ARQUIVO, true);
    }

    public static void EscreverArquivo(String ARQUIVO, String TEXTO) throws IOException {
        OutputStream OS = new FileOutputStream(ARQUIVO, true);
        OutputStreamWriter OSW = new OutputStreamWriter(OS);
        BufferedWriter BW = new BufferedWriter(OSW);
        BW.write(TEXTO);
        BW.newLine();
        BW.close();
    }

    public static ArrayList<funcionario> LerArquivo(String ARQUIVO) throws IOException {
        ArrayList<funcionario> funcionarios = new ArrayList<>();

        InputStream IS = new FileInputStream(ARQUIVO);
        InputStreamReader ISR = new InputStreamReader(IS, "UTF-8");
        BufferedReader BR = new BufferedReader(ISR);

        String linha = BR.readLine(); // Pular cabeçalho
        while ((linha = BR.readLine()) != null) {
            String[] dados = linha.split(";" );

            String cargo = dados[0];
            double salario = Double.parseDouble(dados[1]);
            String nome = dados[2];
            String telefone = dados[3];
            String email = dados[4];
            String endereco = dados[5];
            String cidade = dados[6];
            String estado = dados[7];
            String cep = dados[8];
            int anoNascimento = Integer.parseInt(dados[9]);
            String sexo = dados[10];

            funcionario f = new funcionario(cargo, salario, nome, telefone, email, endereco, cidade, estado, cep, anoNascimento, sexo);
            funcionarios.add(f);
        }

        BR.close();
        return funcionarios;
    }
}
