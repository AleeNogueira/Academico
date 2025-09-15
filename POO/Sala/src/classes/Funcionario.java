package classes;

//Em Java, extends é uma palavra-chave usada para implementar herança
// A Herança permite que uma classe (subclasse ou classe filha) herde atributos e métodos de outra classe (superclasse ou classe pai).
public class Funcionario extends Pessoa {
    //Atributos privados (encapsulamento)
    private String cargo;
    private double salario;

    //Construtores com parâmetros (ou construtores parametrizados) recebem argumentos que são usados para inicializar os atributos do objeto de maneira específica, de acordo com os valores fornecidos no momento da criação do objeto.
    public Funcionario(String cargo, double salario, String nome,
                       String telefone,
                       String email,
                       String endereco,
                       String cidade,
                       String estado,
                       String cep,
                       int anoNascimento,
                       String sexo) {

        //chama o construtor com parâmetros da classe pai (Pessoa)
        super(nome, telefone, email, endereco, cidade, estado, cep, anoNascimento, sexo);

        //inicializa os atributos específicos da classe filho (Funcionário)
        this.cargo = cargo;
        this.salario = salario;
    }

    //Construtores sem parâmetros (ou construtores padrão) não recebem argumentos e geralmente inicializam o objeto com valores padrão.
     public Funcionario() {}


    //Getters e Setters
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
