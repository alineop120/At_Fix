package atfix3un4;
// Importar

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {

    // Atributos
    private String nomeCli;
    private float totDep;
    private final float TXG;

    // Construtor
    public Cliente(String nome) {
        this.nomeCli = nomeCli;
        this.totDep = totDep;
        this.TXG = 0.1f;
    }

    // Métodos
    public void recebe() {
        Scanner sc = new Scanner(System.in); // declarar

        System.out.println("Digite o nome do cliente: ");
        setNomeCli(sc.nextLine());
        System.out.println("Digite a despesa da mesa: ");
        setTotDep(sc.nextFloat());
    }

    public float cTotConta() { // Calcular o total da conta
        // 1ª maneira
        //return (TXG * totDep) + totDep;
        //float totDep;

        // 2ª maneira
        float gorjeta = (getTXG() * getTotDep());
        return gorjeta + getTotDep();
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "CLIENTE: " + getNomeCli()
                + "\nValor total da conta: " + cTotConta());

    }

    // Gerar get e set
    // Botão direito -> Refatorar -> Encapsular Campos...
    // No Encapsular, selacionar todos e desmarcar as constantes
    
    /**
     * @return the nomeCli
     */
    public String getNomeCli() {
        return nomeCli;
    }

    /**
     * @param nomeCli the nomeCli to set
     */
    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    /**
     * @return the totDep
     */
    public float getTotDep() {
        return totDep;
    }

    /**
     * @param totDep the totDep to set
     */
    public void setTotDep(float totDep) {
        this.totDep = totDep;
    }

    /**
     * @return the TXG
     */
    public float getTXG() {
        return TXG;
    }
    
    
}
