
package br.edu.java.etb.atfix4;

public class Exemplo04 {
    double p = 23.3;
    int i;
    public void convertePrim(){
        i= (int) p; // cast para conversão explícita
        System.out.println("p convertido = " +i);
        i=(int) 2.3; // foça conversão para inteiro com perca de casas decimais.
        System.out.println("2.3 convertido = " +i);
    }
    
}
