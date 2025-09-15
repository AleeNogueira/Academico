package Classes;

import java.util.Date;

public class Pessoa {
    String nome;
    String CPF;
    Date data_nascimento;

    public Pessoa(String nome, String CPF, Date data_nnascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.data_nascimento = data_nnascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nnascimento(Date data_nnascimento) {
        this.data_nascimento = data_nnascimento;
    }
}
