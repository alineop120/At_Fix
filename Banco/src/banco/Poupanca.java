
package banco;

/**
 *
 * @author tregis
 */
public class Poupanca extends Conta {
    private  int tempPop;
    
    public Poupanca(String nome, float saldo, int tempPop){
        super(nome,saldo);
        this.tempPop=tempPop;
    }
    
    public void recebe(){
        super.recebe();
        System.out.println("Digite o tempo da poupanca: ");
        tempPop=sc.nextInt();
    }
    
    public void saca(float sac){
        if (tempPop>=30){
            setSaldo(getSaldo()-sac);
        }else{
            System.out.println("Sasque não permitido!!");
        }
    }
    
    public void mostra(){
        super.mostra();
        System.out.println("SALDO CONTA POUPANCA: "+getSaldo());
    }
    
}
