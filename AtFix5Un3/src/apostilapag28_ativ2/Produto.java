/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apostilapag28_ativ2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Produto {
    // Variáveis
    double _valorProduto;
    float _valorNovo, _aumentoPercentua;
    final float AUMENTO = 25;
    
    public void receberDados(){
      // nome = JOptionPane.showInputDialog("Digite seu nome: ");
        _valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Entre com o valor do produto: "));

    }
    
    public void calcularNvValor(){
        
        _valorNovo = (float) _valorProduto + (float)(_valorProduto * AUMENTO / AUMENTO);
        
    }
    
    public void mostrarDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        JOptionPane.showMessageDialog(null, "O valor do produto é "+df.format(_valorNovo));
        
    }
    
}
