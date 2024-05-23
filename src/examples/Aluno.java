package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String dataMatricula;

    private List<Disciplina> listaDisciplinas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome) && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(cpf, aluno.cpf) && Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(listaDisciplinas, aluno.listaDisciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, cpf, dataMatricula, listaDisciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", listaDisciplinas=" + listaDisciplinas +
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
