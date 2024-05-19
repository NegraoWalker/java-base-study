package examples;

import java.util.Locale;

public class AlunoMain {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setIdade(16);
        aluno1.setDataNascimento("21/06/2008");
        aluno1.setCpf("11111111111111-11");
        aluno1.setDataMatricula("24/02/2017");
        aluno1.setNota1(8.12);
        aluno1.setNota2(4.28);
        aluno1.setNota3(7.698);

        Aluno aluno2 = new Aluno("Walker", 31, "12/02/1993", "00000000000-00", "21/12/2019",
                9.58, 7.682,5.235);


        System.out.printf("Média do aluno: %.2f\n", aluno1.getMediaNota());
        System.out.printf("Média do aluno: %.2f", aluno2.getMediaNota());
    }
}
