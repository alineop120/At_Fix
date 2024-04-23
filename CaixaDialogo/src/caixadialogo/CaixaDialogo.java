
package caixadialogo;

import javax.swing.JOptionPane;

public class CaixaDialogo {
    String nome;
    int idade;
    
    public void recebeNome() {
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    }
    
    public void mostraNome() {
        JOptionPane.showMessageDialog(null, "Seu nome: "+nome);
        JOptionPane.showMessageDialog(null, "Sua idade: "+idade);
        
    }
    
}
