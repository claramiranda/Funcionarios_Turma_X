package br.fiap.engsoftware.turmax.domain.model;

/**
 * Classe para abstrair o conceito de um Gerente
 */
public class Gerente extends Funcionario {

    private double salarioBase;
    private double bonusDeDesempenho;

    /**
     * Construtor criado para instanciar Gerente com todos os parametros
     * @param nome Nome do FUncionario
     * @param idade Idade em Anos
     * @param salarioBase Salario Base em Real
     * @param bonusDeDesempenho Bonus em Real
     */
    public Gerente(String nome, int idade, double salarioBase, double bonusDeDesempenho){
        super(nome, idade);
        this.salarioBase = salarioBase;
        this.bonusDeDesempenho = bonusDeDesempenho;
    }

    @Override
    public String toString() {
        return super.toString() + "salarioBase: " + this.salarioBase + "\nBonus: " + this.bonusDeDesempenho + "\n" ;
    }

    /**
     * Implementação de cálculo de salário específica para o Gerente.
     *
     */
    @Override
    public void calcularSalario() {
        setSalario(salarioBase + bonusDeDesempenho);
    }



    /**
     * Descrição do método desenvolvido
     * @author Clara Anna Miranda
     *
     * @deprecated Metodo desenvolvido para explicação, está obsoleto
     *
     * @see Funcionario Veja mais detalhes da implementação da Superclasse
     *
     * @param estaDeFerias(Boolean) Valor booleano indicando se o Gerente está ou não de férias
     *
     *
     * @return String - Texto formatado para ser impresso
     */
    public String verificarFerias(boolean estaDeFerias, String nome){
        String str;
        if (estaDeFerias == true){
            str = "O gerente " + this.getNome() + " está de férias";
        }
        else{
            str = "O gerente " + this.getNome() + " está trabalhando";
        }
        return str;
    }

}
