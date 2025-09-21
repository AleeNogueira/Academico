import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<funcionario> funcionarios = new ArrayList<funcionario>();
        funcionario f = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f1 = new funcionario("QA", 2000, "Pedro", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 2000, "M");
        funcionario f2 = new funcionario("Financeiro", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f3 = new funcionario("Comerciaç", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f4 = new funcionario("escravo", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f5 = new funcionario("CLT", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f6 = new funcionario("Esquentador de Chicote", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f7 = new funcionario("calculador ", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f8 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f9 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f10 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f11 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f12 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f13 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionario f14 = new funcionario("Programador", 10000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M");
        funcionarios.add(f);
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        funcionarios.add(f6);
        funcionarios.add(f7);
        funcionarios.add(f8);
        funcionarios.add(f9);
        funcionarios.add(f10);
        funcionarios.add(f11);
        funcionarios.add(f12);
        funcionarios.add(f13);
        funcionarios.add(f14);


        int maiorIdade = 0;
        String nome = "";

        for (funcionario f15 : funcionarios) {
            System.out.println("Nome: "+f15.getNome()+" idade: "+f15.calcularIdade());
            if(maiorIdade < f15.calcularIdade()){
                maiorIdade = f15.calcularIdade();
                nome = f15.getNome();
            }
        }
        System.out.println( nome + ", " +maiorIdade);


        ArrayList<gerente> gerentes = new ArrayList<gerente>();
        gerente g = new gerente("Gerente", 3000, "João", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1990, "M" );
        gerente g1 = new gerente("Gerente do Gerente", 4000, "Joaquim", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1980, "M" );
        gerente g2 = new gerente("Gerente do Gerente do Gerente", 5000, "Anastacio", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1978, "M" );
        gerente g3 = new gerente("Gerente do gerente do gerente do gerente ", 6000, "Kleber", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1976, "M" );
        gerente g4 = new gerente("Gerente do Gerente do Gerente do Gerente do Gerente", 7000, "Adebaldo", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1974, "M" );
        gerente g5 = new gerente("Gerente do Gerente do Gerente do Gerente do Gerente do Gerente", 8000, "Carlos", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1991, "M" );
        gerente g6 = new gerente("Gerente do Gerente do Gerente do Gerente do Gerente do Gerente do Gerente", 9000, "Fernando", "1234", "j@j.com", "Rua 1", "Cidade", "SP", "123456", 1970, "M" );
        gerentes.add(g);
        gerentes.add(g2);
        gerentes.add(g3);
        gerentes.add(g4);
        gerentes.add(g5);
        gerentes.add(g6);
    }
}
