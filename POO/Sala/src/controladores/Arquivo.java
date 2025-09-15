package controladores;

import classes.Funcionario;

import java.io.*;
import java.util.ArrayList;

public class    Arquivo {
    // atributos

    public Arquivo() {
    }

    // metodos
    public static void CriarArquivo(String ARQUIVO) throws IOException {
        new FileWriter(ARQUIVO, true);
    }

    public static void EscreverArquivo(String ARQUIVO, String TEXTO) throws IOException {
    	/*
    	 * Stream é um canal de comunicação usado para transferir dados entre uma origem (source) e um destino (destination).
		   
		   Tanto o InputStream como o OutputStream são usados para leitra e escrita de dados usando bytes, respectivamente
		   
		   FileOutputStream – abre o arquivo para escrita em formato binário.	
		   OutputStreamWriter - Converte os bytes do OutputStream em caracteres, usando a codificação padrão do sistema (poderia ser especificada outra, como "UTF-8").
    	 
    	   BufferedWriter - Adiciona um buffer à escrita, tornando-a mais eficiente, pois não envia cada caractere diretamente ao arquivo, mas sim em blocos.
    	 */
        OutputStream OS = new FileOutputStream(ARQUIVO, true);
        OutputStreamWriter OSW = new OutputStreamWriter(OS);
        BufferedWriter BW = new BufferedWriter(OSW);
        BW.write(TEXTO);
        BW.newLine();
        BW.close();
    }

    public static ArrayList<Funcionario> LerArquivo(String  ) throws IOException {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        InputStream IS = new FileInputStream(ARQUIVO);
        InputStreamReader ISR = new InputStreamReader(IS, "UTF-8");
        BufferedReader BR = new BufferedReader(ISR);

        String linha = BR.readLine(); // Pular cabeçalho
        while ((linha = BR.readLine()) != null) {

            //A maneira mais fácil de dividir uma string em Java é usar o metodo .split
            //Ele divide a string a cada ocorrência da regra passada ao metodo
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

            Funcionario f = new Funcionario(cargo, salario, nome, telefone, email, endereco, cidade, estado, cep, anoNascimento, sexo);
            funcionarios.add(f);
        }

        BR.close();
        return funcionarios;
    }
}
