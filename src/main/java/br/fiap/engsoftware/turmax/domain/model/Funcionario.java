package br.fiap.engsoftware.turmax.domain.model;

/**
 * Classe para abstrair o conceito de um Funcionário básico.
 */
public class Funcionario {

    private String nome;
    private int idade;
    private double salario;


    // Comentário de uma linha
    /*
        Comentário em Bloco
     */


    /**
     * Método a ser sobreescrito nas classes filhas com lógica para cálculo de salário bruto
     */
    public void calcularSalario(){
        System.out.println("Método para calcular o salário");
    }


    @Override
    public String toString() {
        return "nome: " + getNome() + "\nidade: " + getIdade() + "\nsalario: " + getSalario() + "\ntipo: " + getClass() + "\n";
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

    //FIXME Validar se a String contém apenas números
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
