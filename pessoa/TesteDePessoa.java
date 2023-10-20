package pessoa;

public class TesteDePessoa {
         
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("333222111");
        professor.setNome("Rodrigo");
        professor.setIdade(42);
        professor.setSalario(50000);                 
        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("111222333");
        aluno.setNome("Lorenzo");
        aluno.setIdade(5);
        aluno.setMatricula("231118"); 
        System.out.println(aluno.imprimirDadosDaPessoa());

    }
}