/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aap2un4;

/**
 *
 * @author 364975
 */
public class Programador extends Empregado{
    
    /**
     * Construtor
     * @param nome
     * @param salario 
     */
    public Programador(String nome, double salario) {
        super(nome, salario);
    }
    
    /**
     * 
     * @param aumento 
     */
    @Override
    public void aumentarSalario(double aumento){
        
    }
    
    public void bonusSalario();// método abstrato
    
    
    
    
    /**
     * 
     * @return aumento do salário
     */
    @Override
    public String toString() {
        return(super.toString()+"\nAUMENTO: "+df.format(getAumento()));
    }
}
