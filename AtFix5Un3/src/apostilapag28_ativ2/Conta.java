/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag28_ativ2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Conta {
    // Variáveis
    final float TX_GORJETA = 10;
    double totalDespesa;
    float _gorjeta,_valorTotal;
    
    public void rebecerDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da despesa: ");
        totalDespesa = sc.nextDouble();
    }
    
    public void calcularGorjeta(){
        _gorjeta = (float) (totalDespesa * TX_GORJETA);
        
    }

    public void calcularTotalDespesa(){
        _valorTotal = (float) (_gorjeta + totalDespesa);
    }
    
    public void mostrarDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        JOptionPane.showMessageDialog(null,"valor da Conta: "+df.format(_valorTotal));
        
        
    }
    
}
