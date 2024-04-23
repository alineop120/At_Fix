
package br.edu.java.etb.atfix4;

public class Exemplo06 {
    int x = 12, y = 7; // variávais do mesmo tipo podem ser declaradas na mesma linha
    
    public void operadorLog(){
        System.out.println((x>10) && (x<20)); // Operador lógico E
        System.out.println((y<50) || (y >= 100)); // Operador lógico OU
        System.out.println(y>0); // Operador lógico maior que
        System.out.println(!(y>0)); // Operador lógico de negação
}
    
}
