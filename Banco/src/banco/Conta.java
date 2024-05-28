
package banco;

import java.util.Scanner;


public abstract class Conta {
    private String nome;
    private float saldo;
    Scanner sc = new Scanner(System.in);
    
    public Conta(String nome, float saldo ){
        this.nome=nome;
        this.saldo=saldo;
    }
    
    public void recebe(){
        System.out.print("Digite o nome do cliente:");
        nome=sc.nextLine();
        System.out.print("Digite o saldo do cliente:");
        saldo=sc.nextFloat();
        
    }
    
    public abstract void saca(float sac);//assinei a regra generica
    
    public void mostra(){
        System.out.println("NOME: "+getNome()+"\nSALDO: "+getSaldo());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
        
}
