package br.fiap.engsoftware.turmax.domain.model;

public class FuncionarioIntegral extends Funcionario{



    @Override
    public void calcularSalario() {
        getSalario();
    }

    public FuncionarioIntegral(String nome, int idade, double salario){
        super(nome, idade, salario);
    }

}
