package examples;

public class PessoaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Diretor diretor = new Diretor();

        aluno.setNome("Walker");
        aluno.setIdade(31);
        aluno.setCpf("0000000000000-00");

        System.out.println(aluno);
    }
}
