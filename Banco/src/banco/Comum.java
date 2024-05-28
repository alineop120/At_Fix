
package banco;


public class Comum extends Conta {
    
    public Comum(String nome, float saldo){
        super(nome,saldo);
    }
    
   
    
    public void saca(float sac){
        setSaldo(getSaldo()- sac);
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("SALDO CONTA COMUM "+getSaldo());
    }
    
    
}
