package br.fiap.engsoftware.turmax.domain.model;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;


    public void calcularSalario(){
        System.out.println("Método para calcular o salário");
    }



    //CONSTRUCTOR
    public Funcionario(String nome, int idade, double salario) {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }

    public Funcionario(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }


    //GETTERS AND SETTERS
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("nome vazio =( ");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
