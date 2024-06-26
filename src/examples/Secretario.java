package examples;

public class Secretario extends Pessoa{
    private String registro;
    private String nivelCargo;
    private String experiencia;

    public Secretario() {
    }

    public Secretario(String nome, int idade, String dataNascimento, String cpf, String dataMatricula, String registro, String nivelCargo, String experiencia) {
        super(nome, idade, dataNascimento, cpf, dataMatricula);
        this.registro = registro;
        this.nivelCargo = nivelCargo;
        this.experiencia = experiencia;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
