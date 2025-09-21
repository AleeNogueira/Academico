public class gerente extends pessoa {
    String setor;
    double salario;

    public gerente(String setor, double salario, String nome, String telefone, String email, String endereco, String cidade, String estado, String cep, int anoNascimento, String sexo) {
        this.setor = setor;
        this.salario = salario;
        super.nome = nome;
        super.telefone = telefone;
        super.email = email;
        super.endereco = endereco;
        super.cidade = cidade;
        super.estado = estado;
        super.cep = cep;
        super.anoNascimento = anoNascimento;
        super.sexo = sexo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
