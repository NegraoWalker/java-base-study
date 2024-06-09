package examples;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String dataMatricula;
    private List<Disciplina> listaDisciplinas = new ArrayList<>();


    public Aluno() {
    }

    public Aluno(String nome, int idade, String dataNascimento, String cpf, String dataMatricula, String dataMatricula1, List<Disciplina> listaDisciplinas) {
        super(nome, idade, dataNascimento, cpf, dataMatricula);
        this.dataMatricula = dataMatricula1;
        this.listaDisciplinas = listaDisciplinas;
    }


    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", listaDisciplinas=" + listaDisciplinas +
                ", nome=" + getNome() +
                ", idade=" + getIdade() +
                ", data de nascimento=" + getDataNascimento() +
                ", cpf=" + getCpf() +
                '}';
    }

    public double getMediaNota() {
        double somaNotas = 0.00;
        for (Disciplina disciplina: listaDisciplinas) {
            somaNotas+= disciplina.getNota();
        }
        return somaNotas / listaDisciplinas.size();
    }

    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 7.00) {
            return true;
        } else {
            return false;
        }
    }
}
