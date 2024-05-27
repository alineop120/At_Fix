/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 364975
 */
public class Poupanca extends Conta
{
    // Atributo
    private int tempPoup;
    
    // Construtor
    public Poupanca (String nomeCli, int numCont, int temPoup){
        super(nomeCli, numCont);
        this.tempPoup=tempPoup;
    }
    
    public void soma(float sac){
        if (tempPoup >= 30){
            getSaldo(getSaldo() - sac);
        }else{
            System.out.println("\n Saque negado!!");
            System.exit(0);
        }
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("SALDO> " + getSaldo());
    }

    @Override
    public void saca(float sac) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSaldo(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
