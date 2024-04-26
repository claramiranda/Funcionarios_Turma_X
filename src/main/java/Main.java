import br.fiap.engsoftware.turmax.domain.model.Funcionario;
import br.fiap.engsoftware.turmax.domain.model.FuncionarioIntegral;
import br.fiap.engsoftware.turmax.domain.model.FuncionarioPorHora;
import br.fiap.engsoftware.turmax.domain.model.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcelo", 32, 10000, 2000);
        gerente.calcularSalario();

        FuncionarioPorHora porHora = new FuncionarioPorHora("Anderson", 28,14.5f, 176);
        porHora.calcularSalario();

        FuncionarioIntegral integral = new FuncionarioIntegral("Bárbara", 22, 5500);
        integral.calcularSalario();


        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = gerente;
        funcionarios[1] = porHora;
        funcionarios[2] = integral;

        for (Funcionario funcionario: funcionarios){
            if(funcionario != null){
                System.out.println(funcionario);
                   if (funcionario.getClass() == Gerente.class){
                    System.out.println("é um gerente ");
                }
            }
        }
    }
}