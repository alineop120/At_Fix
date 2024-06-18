
package atfix6un4;

/**
 * Classe Gerente, subclasse de Empregado
 */ 
public class Gerente extends Empregado {
    // Construtor com parâmetros
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescreve o método aumentarSalario para aumentar 15%
    @Override
    public void aumentarSalario() {
        // Aumento de 15%
        double aumento = getSalario() * 0.15;
        super.setSalario(super.getSalario() + aumento);
    }

    // Método toString para exibir os dados do gerente
    @Override
    public String toString() {
        return "Gerente [nome=" + getNome() + ", salario=" + getSalario() + "]";
    }
}

