
package br.edu.java.etb.atfix4;

public class Exemplo05 {
    int x = 0;
    
    public void atribuiReducao() {
        x += 2; // substitui a expressão x=x+2
        System.out.println("x = " + x);
        x *= 3; // substitui a expressão x=x*3
        System.out.println("x = " + x);
        x /= 2; // substitui a expressão x=x/2
        System.out.println("x = " + x);
        x -= 5; // susbtitui a expressão x=x-5
        System.out.println("x = " + x);
    }
    
}
