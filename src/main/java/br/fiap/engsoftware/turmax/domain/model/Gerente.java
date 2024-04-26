package br.fiap.engsoftware.turmax.domain.model;

public class Gerente extends Funcionario {

    private double salarioBase;
    private double bonusDeDesempenho;

    public Gerente(String nome, int idade, double salarioBase, double bonusDeDesempenho){
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.bonusDeDesempenho = bonusDeDesempenho;
    }

    @Override
    public String toString() {
        return super.toString() + "salarioBase: " + this.salarioBase + "\nBonus: " + this.bonusDeDesempenho + "\n" ;
    }

    @Override
    public void calcularSalario() {
        setSalario(salarioBase + bonusDeDesempenho);
    }

}
