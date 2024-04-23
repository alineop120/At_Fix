package apostilapag28_ativ2;

/**
 * Escola Técnica de Brasília - ETB
 * Curso Técnico de Informática
 * Linguagem Técnica de Programação 1 - Java  
 * 09.04.2024
 * Aline Oliveira de Pinho 
 * 2H
 * Classe executável que dado o total de despesas realizadas em um restaurante, 
informe o valor total a ser pago com gorjeta, considerando a taxa de 10%.
 */
public class TesteConta {

    public static void main(String[] args) {
        Conta con = new Conta();
        
        con.rebecerDados();
        con.calcularGorjeta();
        con.calcularTotalDespesa();
        con.mostrarDados();
    }
    
}
