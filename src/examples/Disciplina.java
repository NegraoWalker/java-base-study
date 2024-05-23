package examples;

import java.util.List;
import java.util.Objects;

public class Disciplina {
    private String nomeDisciplina;
    private double nota;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Double.compare(nota, that.nota) == 0 && Objects.equals(nomeDisciplina, that.nomeDisciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDisciplina, nota);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}
