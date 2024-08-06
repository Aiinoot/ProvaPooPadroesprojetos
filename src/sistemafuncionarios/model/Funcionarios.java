package sistemafuncionarios.model;

import java.util.List;

public class Funcionarios {
    private String nome;
    private String departamento;
    private Double salario;
    private List<Funcionarios> subordinados;

    public Funcionarios(String nome, String departamento, Double salario, List<Funcionarios> subordinados) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.subordinados = subordinados;
    }

    public void addFuncionarios(Funcionarios f){
        add.(f);
    }
}
