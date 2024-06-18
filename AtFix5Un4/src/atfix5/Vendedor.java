
package atfix5;

public class Vendedor extends Funcionario {//subclasse vendedor

    private final float TXC = .05f;

    public Vendedor(String nome) {//construtor de vendedor
        super(nome);
        

    }
    
   public double cComis(){
        
       return TXC * getTotV();
   } 
   
   public void mostra(){
       super.mostra();
       System.out.println("\nVALOR COMISSÃO: "+cComis());
   }

}
