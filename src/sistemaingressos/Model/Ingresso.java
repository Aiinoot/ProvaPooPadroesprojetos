package sistemaingressos.Model;

import org.w3c.dom.ls.LSOutput;

public class Ingresso {
    private String dia;
    private Float valor;
    private Boolean valido;
    private Float taxaServico;
    private Portador portador;

    public Ingresso(String dia, Float valor, Boolean valido, Float taxaServico, Portador portador) {
        this.dia = dia;
        this.valor = valor;
        this.valido = valido;
        this.taxaServico = taxaServico;
        this.portador = portador;

    }

    //public void calculaValorIngresso(Float valor, Float taxaServico){
    // float valorTotal = 0;
    // valorTotal = valor + taxaServico;
    //   System.out.println("O valor total do ingresso é: " +valorTotal);;
    //};

    public float calculaValorIngresso(){
        float valorTotal = 0;
        valorTotal = valor + taxaServico;
        return valorTotal;
    };
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }

    public Float getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Float taxaServico) {
        this.taxaServico = taxaServico;
    }

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
    }

}
