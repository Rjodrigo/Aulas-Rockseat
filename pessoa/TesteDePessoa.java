package pessoa;

public class TesteDePessoa {
      
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "333222111";
        pessoa1.nome = "Rodrigo";
        pessoa1.idade = 42;

        System.out.println(pessoa1.imprimirDadosDaPessoa(1));

         Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "111222333";
        pessoa2.nome = "Lorenzo";
        pessoa2.idade = 5;

        System.out.println(pessoa2.imprimirDadosDaPessoa(2));

    }
}