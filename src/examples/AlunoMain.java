package examples;

import javax.swing.*;
import java.util.Locale;

public class AlunoMain {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));

//        Aluno aluno1 = new Aluno();
//        aluno1.setNome("Lucas");
//        aluno1.setIdade(16);
//        aluno1.setDataNascimento("21/06/2008");
//        aluno1.setCpf("11111111111111-11");
//        aluno1.setDataMatricula("24/02/2017");
//        aluno1.setNota1(8.12);
//        aluno1.setNota2(4.28);
//        aluno1.setNota3(7.698);
//
//        Aluno aluno2 = new Aluno("Walker", 31, "12/02/1993", "00000000000-00", "21/12/2019",
//                9.58, 7.682,5.235);
//
//
//        System.out.printf("Média do aluno: %.2f\n", aluno1.getMediaNota());
//        System.out.printf("Média do aluno: %.2f\n", aluno2.getMediaNota());
//
//        System.out.println(aluno1.getAlunoAprovado());
//        System.out.println(aluno2.getAlunoAprovado());
//
//        System.out.println("=======================================================================");
//
//        Aluno aluno3 = new Aluno();
//
//
//        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
//        String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
//        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno: ");
//        String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
//        String dataMatricula = JOptionPane.showInputDialog("Informe a data de matrícula do aluno: ");
//        String nota1Aluno = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
//        String nota2Aluno = JOptionPane.showInputDialog("Informe a segunda nota do aluno: ");
//        String nota3Aluno = JOptionPane.showInputDialog("Informe a terceira nota do aluno: ");
//
//
//        aluno3.setNome(nome);
//        aluno3.setIdade(Integer.parseInt(idade));
//        aluno3.setDataNascimento(dataNascimento);
//        aluno3.setCpf(cpf);
//        aluno3.setDataMatricula(dataMatricula);
//        aluno3.setNota1(Double.parseDouble(nota1Aluno));
//        aluno3.setNota2(Double.parseDouble(nota2Aluno));
//        aluno3.setNota3(Double.parseDouble(nota3Aluno));
//
//        System.out.println("Aluno 3 foi aprovado: " + aluno3.getAlunoAprovado());
//        System.out.println(aluno3.toString());
//
//        System.out.println(aluno2.equals(aluno3));
//        System.out.println(aluno2.hashCode());
//        System.out.println(aluno3.hashCode());

//
//        Aluno aluno4 = new Aluno();
//
//        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
//        String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
//        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno: ");
//        String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
//        String dataMatricula = JOptionPane.showInputDialog("Informe a data de matrícula do aluno: ");
//        String disciplina1 = JOptionPane.showInputDialog("Informe a primeira disciplina do aluno: ");
//        String nota1Aluno = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
//        String disciplina2= JOptionPane.showInputDialog("Informe a segunda disciplina do aluno: ");
//        String nota2Aluno = JOptionPane.showInputDialog("Informe a segunda nota do aluno: ");
//        String disciplina3 = JOptionPane.showInputDialog("Informe a terceira disciplina do aluno: ");
//        String nota3Aluno = JOptionPane.showInputDialog("Informe a terceira nota do aluno: ");
//
//
//        aluno4.setNome(nome);
//        aluno4.setIdade(Integer.parseInt(idade));
//        aluno4.setDataNascimento(dataNascimento);
//        aluno4.setCpf(cpf);
//        aluno4.setDataMatricula(dataMatricula);
//        aluno4.getDisciplina().setDisciplina1(disciplina1);
//        aluno4.getDisciplina().setNota1(Double.parseDouble(nota1Aluno));
//        aluno4.getDisciplina().setDisciplina2(disciplina2);
//        aluno4.getDisciplina().setNota2(Double.parseDouble(nota2Aluno));
//        aluno4.getDisciplina().setDisciplina3(disciplina3);
//        aluno4.getDisciplina().setNota3(Double.parseDouble(nota3Aluno));
//
//        System.out.println(aluno4.toString());

//        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
//        String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
//        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno: ");
//        String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
//        String dataMatricula = JOptionPane.showInputDialog("Informe a data de matrícula do aluno: ");
//        String nomeDisciplina1 = JOptionPane.showInputDialog("Informe a primeira disciplina do aluno: ");
//        String nota1Aluno = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
//        String nomeDisciplina2 = JOptionPane.showInputDialog("Informe a segunda disciplina do aluno: ");
//        String nota2Aluno = JOptionPane.showInputDialog("Informe a segunda nota do aluno: ");
//        String nomeDisciplina3 = JOptionPane.showInputDialog("Informe a terceira disciplina do aluno: ");
//        String nota3Aluno = JOptionPane.showInputDialog("Informe a terceira nota do aluno: ");
//
//
//
//        Aluno aluno5 = new Aluno();
//        Disciplina disciplina1 = new Disciplina();
//        Disciplina disciplina2 = new Disciplina();
//        Disciplina disciplina3 = new Disciplina();
//
//        aluno5.setNome(nome);
//        aluno5.setIdade(Integer.parseInt(idade));
//        aluno5.setDataNascimento(dataNascimento);
//        aluno5.setCpf(cpf);
//        aluno5.setDataMatricula(dataMatricula);
//        disciplina1.setNomeDisciplina(nomeDisciplina1);
//        disciplina1.setNota(Double.parseDouble(nota1Aluno));
//        aluno5.getListaDisciplinas().add(disciplina1);
//        disciplina2.setNomeDisciplina(nomeDisciplina1);
//        disciplina2.setNota(Double.parseDouble(nota2Aluno));
//        aluno5.getListaDisciplinas().add(disciplina2);
//        disciplina3.setNomeDisciplina(nomeDisciplina1);
//        disciplina3.setNota(Double.parseDouble(nota3Aluno));
//        aluno5.getListaDisciplinas().add(disciplina3);
//
//        System.out.println(aluno5.toString());
//        System.out.println(aluno5.getAlunoAprovado());

// -------------------------------------Aluno 6-------------------------------------------------------------------------------
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
        String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento do aluno: ");
        String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
        String dataMatricula = JOptionPane.showInputDialog("Informe a data de matrícula do aluno: ");

        Aluno aluno6 = new Aluno();

        aluno6.setNome(nome);
        aluno6.setIdade(Integer.parseInt(idade));
        aluno6.setDataNascimento(dataNascimento);
        aluno6.setCpf(cpf);
        aluno6.setDataMatricula(dataMatricula);

        for (int i = 1; i < 4; i++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina " + i + ":");
            String notaAluno = JOptionPane.showInputDialog("Informe o valor da nota " + i + ":");
            Disciplina disciplina = new Disciplina();
            disciplina.setNomeDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(notaAluno));
            aluno6.getListaDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum disciplina?");
        if (escolha == 0) {
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina você deseja remover? ");
            aluno6.getListaDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
        }


        System.out.println(aluno6.toString());
        System.out.println(aluno6.getAlunoAprovado());

    }
}
