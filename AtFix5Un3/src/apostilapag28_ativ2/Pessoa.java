/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag28_ativ2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Pessoa {
    double pesoAtual, pesoDesejado;
    float persenElimin, pesoElimin;
    
    public void receber() {
        pesoAtual = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peso atual: "));
        pesoDesejado = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peso desejado: "));
        
    }
    
    public void calcPeso() {
        //Calcular o peso que será eliminado.
        pesoElimin = (float) (pesoAtual - pesoDesejado);
        
    }
    
    public void calcPersen(){
        //Calcular o persentual do peso eliminado.
        persenElimin = (float) (pesoElimin / pesoAtual) * 100;
    }
    
    public void mostrar(){
        DecimalFormat df;
        df = new DecimalFormat("#,##0.0");
        JOptionPane.showMessageDialog(null,"Persentual de Gordura Eliminado: "+persenElimin);
        
    }
}
