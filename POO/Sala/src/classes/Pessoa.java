package classes;

public class Pessoa {
    //Atributos privados: encapsulamento
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private int anoNascimento;
    private String sexo;

    // Explicação:
    // Em programação orientada a objetos, um construtor é um metodo especial usado para inicializar um objeto quando ele é criado.
    //A principal diferença entre um construtor com e sem parâmetros reside na forma como o objeto é inicializado.
    // Construtores sem parâmetros (ou construtores padrão) não recebem argumentos e geralmente inicializam o objeto com valores padrão.
    // Construtores com parâmetros (ou construtores parametrizados) recebem argumentos que são usados para inicializar os atributos do objeto de maneira específica, de acordo com os valores fornecidos no momento da criação do objeto.

    //Construtor parametrizado
    public Pessoa(String nome, String telefone, String email, String endereco, String cidade, String estado, String cep, int anoNascimento, String sexo) {
        //Em Java, this é uma referência ao objeto atual dentro de um metodo ou construtor.
        // Ele serve para acessar os atributos do objeto atual, diferenciando-os dos parâmetros passados para o construtor com o mesmo nome.
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
    }

    //Construtor não parametrizado
    public Pessoa() {}

    public void comer() {
        System.out.println("Estou comendo");
    }

    public void dormir() {
        System.out.println("Estou dormindo");
    }

    public int calcularIdade() {
        int anoAtual = 2025;
        int idade;
        idade = anoAtual - this.anoNascimento;
        return idade;
    }

    //Em Java, getters e setters são métodos usados para acessar e modificar os atributos (variáveis de instância) de uma classe de forma controlada, seguindo o princípio do encapsulamento. Eles permitem controlar o acesso aos dados da classe, protegendo-os de modificações ou acessos não autorizados.
    //Getters (métodos "get") são usados para retornar o valor de um atributo específico da classe. Normalmente, o nome do método getter começa com "get" seguido do nome do atributo, com a primeira letra do nome do atributo em maiúscula (ex: getSaldo() para o atributo saldo).
    //Setters (métodos "set") são usados para definir ou atualizar o valor de um atributo da classe. Normalmente, o nome do método setter começa com "set" seguido do nome do atributo, com a primeira letra do nome do atributo em maiúscula (ex: setSaldo(double saldo) para o atributo saldo).
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}