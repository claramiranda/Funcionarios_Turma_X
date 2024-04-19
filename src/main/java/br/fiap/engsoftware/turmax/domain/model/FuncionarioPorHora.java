package br.fiap.engsoftware.turmax.domain.model;

public class FuncionarioPorHora extends Funcionario{
    private float valorPorHora;
    private float horasTrabalhadas;

    @Override
    public void calcularSalario() {
        setSalario(valorPorHora * horasTrabalhadas);
    }


    public FuncionarioPorHora(String nome, int idade, float valorPorHora, float horasTrabalhadas){
        super(nome, idade);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
}
