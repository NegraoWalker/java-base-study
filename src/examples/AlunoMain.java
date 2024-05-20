package examples;

import javax.swing.*;
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
        System.out.printf("Média do aluno: %.2f\n", aluno2.getMediaNota());

        System.out.println(aluno1.getAlunoAprovado());
        System.out.println(aluno2.getAlunoAprovado());

        System.out.println("=======================================================================");

        Aluno aluno3 = new Aluno();


        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno: ");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
        String dataMatricula = JOptionPane.showInputDialog("Informe a data de matrícula do aluno: ");
        String nota1Aluno = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
        String nota2Aluno = JOptionPane.showInputDialog("Informe a segunda nota do aluno: ");
        String nota3Aluno = JOptionPane.showInputDialog("Informe a terceira nota do aluno: ");


        aluno3.setNome(nome);
        aluno3.setIdade(Integer.parseInt(idade));
        aluno3.setDataNascimento(dataNascimento);
        aluno3.setCpf(cpf);
        aluno3.setDataMatricula(dataMatricula);
        aluno3.setNota1(Double.parseDouble(nota1Aluno));
        aluno3.setNota2(Double.parseDouble(nota2Aluno));
        aluno3.setNota3(Double.parseDouble(nota3Aluno));

        System.out.println("Aluno 3 foi aprovado: " + aluno3.getAlunoAprovado());

    }
}
