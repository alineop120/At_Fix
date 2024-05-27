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
public class Comum extends Conta
{
    public Comum(String nomeCli, int numCont){
        super(nomeCli,numCont);
    }
    
    @Override
    public void saca(float sac){
        setSaldo(getSaldo() - sac);
    }
    
    public void mostra(String getSaldo){
        super.mostra(); //herança
        System.out.println("SALDO> " +getSaldo());
    }
}
