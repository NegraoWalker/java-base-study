package examples;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String dataMatricula;

    private Disciplina disciplina = new Disciplina();

    public Aluno() {
    }

    public Aluno(String nome, int idade, String dataNascimento, String cpf, String dataMatricula, Disciplina disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.dataMatricula = dataMatricula;
        this.disciplina = disciplina;
    }

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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome) && Objects.equals(dataNascimento, aluno.dataNascimento) && Objects.equals(cpf, aluno.cpf) && Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(disciplina, aluno.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, cpf, dataMatricula, disciplina);
    }

    //Métodos personalizados:
    public double getMediaNota() {
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3()) / 3;
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
