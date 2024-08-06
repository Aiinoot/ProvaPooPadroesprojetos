package sistemaingressos.Model;

import java.util.Arrays;

public class Evento {
    private Integer codigo;
    private String nome;
    private String periodo;
    private Integer capacidade;
    private Local local;
    private Ingresso[] ingressos;

    public Evento() {
    }

    public Evento(Integer codigo, String nome, String periodo, Integer capacidade, Local local, Ingresso[] ingressos) {
        this.codigo = codigo;
        this.nome = nome;
        this.periodo = periodo;
        this.capacidade = capacidade;
        this.local = local;
        this.ingressos = ingressos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Ingresso[] getIngressos() {
        return ingressos;
    }

    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", periodo='" + periodo + '\'' +
                ", capacidade=" + capacidade +
                ", local=" + local +
                ", ingressos=" + Arrays.toString(ingressos) +
                '}';
    }
}
