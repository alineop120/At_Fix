
package atfix5;

import java.util.Scanner;


public class Funcionario {// superclasse funcionario
    private String nomeFun, rg;
    private double totV;
   
    
    public Funcionario(String nomeFun){
        this.nomeFun=nomeFun;
    }
    
    public void recebe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o nome do funcionário: ");
        setNomeFun(sc.nextLine());
        System.out.print("Entre com o RG do funcionário: ");
        setRg(sc.next());
        System.out.print("Entre com o total das vendas: ");
        setTotV(sc.nextDouble());
    }
    
    public void mostra(){
        System.out.println("NOME: "+getNomeFun()+"\tRG: "+getRg()
                +"\nTOTAL VENDAS: "+getTotV());
    }

    /**
     * @return the nomeFun
     */
    public String getNomeFun() {
        return nomeFun;
    }

    /**
     * @param nomeFun the nomeFun to set
     */
    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the totV
     */
    public double getTotV() {
        return totV;
    }

    /**
     * @param totV the totV to set
     */
    public void setTotV(double totV) {
        this.totV = totV;
    }
    
    
}
