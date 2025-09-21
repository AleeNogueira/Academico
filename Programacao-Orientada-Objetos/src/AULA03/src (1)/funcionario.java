public class funcionario extends pessoa {
    String cargo;
    double salario;

    public funcionario(String cargo, double salario, String nome, String telefone, String email, String endereco, String cidade, String estado, String cep, int anoNascimento, String sexo) {
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
