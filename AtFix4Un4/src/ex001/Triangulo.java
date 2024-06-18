
package ex001;

/**
 * Representa um triângulo e verifica suas propriedades geométricas.
 */
public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    /**
     * Construtor para criar um objeto Triangulo com os comprimentos dos lados fornecidos.
     * 
     * @param lado1 Comprimento do lado 1 do triângulo.
     * @param lado2 Comprimento do lado 2 do triângulo.
     * @param lado3 Comprimento do lado 3 do triângulo.
     */
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Verifica se o triângulo é equilátero (todos os lados iguais).
     * 
     * @return true se o triângulo é equilátero, false caso contrário.
     */
    public boolean ehEquilatero() {
        return lado1 == lado2 && lado2 == lado3;
    }

    /**
     * Verifica se o triângulo é isósceles (dois lados iguais).
     * 
     * @return true se o triângulo é isósceles, false caso contrário.
     */
    public boolean ehIsosceles() {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    /**
     * Verifica se o triângulo é escaleno (todos os lados diferentes).
     * 
     * @return true se o triângulo é escaleno, false caso contrário.
     */
    public boolean ehEscaleno() {
        return lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }

    /**
     * Retorna uma representação textual do triângulo com seus lados.
     * 
     * @return Uma string que representa o triângulo com seus lados.
     */
    @Override
    public String toString() {
        return "Triângulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
    }
}