package pessoa;

public class Pessoa {
    // nome, idade, cpf
    //tipo nomeDaVatiavel

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(int indice) {

        return "O nome da pessoa é " + nome + " a idade é " + idade + " e o documento é " + cpf + " e o indice é " + indice;
    }
}
