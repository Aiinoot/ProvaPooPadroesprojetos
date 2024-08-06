package sistemaingressos.Model;

public class Portador {
    private String cpf;
    private String nome;
    private String fone;

    public Portador() {
    }

    public Portador(String cpf, String nome, String fone) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    @Override
    public String toString() {
        return "Portador{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }
}
