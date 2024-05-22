package examples;

import java.util.Objects;

public class Disciplina {
    private double nota1;
    private double nota2;
    private double nota3;
    private String disciplina1;
    private String disciplina2;
    private String disciplina3;

    public Disciplina() {
    }

    public Disciplina(double nota1, double nota2, double nota3, String disciplina1, String disciplina2, String disciplina3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.disciplina1 = disciplina1;
        this.disciplina2 = disciplina2;
        this.disciplina3 = disciplina3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getDisciplina1() {
        return disciplina1;
    }

    public void setDisciplina1(String disciplina1) {
        this.disciplina1 = disciplina1;
    }

    public String getDisciplina2() {
        return disciplina2;
    }

    public void setDisciplina2(String disciplina2) {
        this.disciplina2 = disciplina2;
    }

    public String getDisciplina3() {
        return disciplina3;
    }

    public void setDisciplina3(String disciplina3) {
        this.disciplina3 = disciplina3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Objects.equals(disciplina1, that.disciplina1) && Objects.equals(disciplina2, that.disciplina2) && Objects.equals(disciplina3, that.disciplina3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota1, nota2, nota3, disciplina1, disciplina2, disciplina3);
    }
}
