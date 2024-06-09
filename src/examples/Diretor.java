package examples;

public class Diretor extends Pessoa{
    private String registroEducacao;
    private int tempoDirecao;
    private String titulacao;

    public Diretor() {
    }

    public Diretor(String nome, int idade, String dataNascimento, String cpf, String dataMatricula, String registroEducacao, int tempoDirecao, String titulacao) {
        super(nome, idade, dataNascimento, cpf, dataMatricula);
        this.registroEducacao = registroEducacao;
        this.tempoDirecao = tempoDirecao;
        this.titulacao = titulacao;
    }

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public int getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(int tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
