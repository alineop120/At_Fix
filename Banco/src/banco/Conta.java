/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 364975
 */
public abstract class Conta  // A classe Conta é abstrada
{
    // Atritudos
    private String nomeCli;   // nome do Cliente
    private int numCont;     // numero da conta do cliente
    private float saldo;
    
    private Scanner sc = new Scanner(System.in);
    
    // Construtor
    public Conta (String nome, int num){
        this.nomeCli=nomeCli;
        this.numCont=numCont;
    }
    
    // Métodos
    public void recebe()
    {
        System.out.println("Digite o nome do cliente: ");
        setNomeCli(getSc().nextLine());
        System.out.println("Digite o nº da conta corrente: ");
        setNumCont(getSc().nextInt());
        System.out.println("Digite o saldo da conta: ");
        setSaldo(getSc().nextFloat());
        
    }
    // Abstração
    public abstract void saca(float sac);
    
    public void mostra()
    {
        System.out.println("CLIENTE> " + getNomeCli()
                + "\nCONTA> " + getNumCont() + "SALDO> " + getSaldo());
    }

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
     * @return the numCont
     */
    public int getNumCont() {
        return numCont;
    }

    /**
     * @param numCont the numCont to set
     */
    public void setNumCont(int numCont) {
        this.numCont = numCont;
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

    /**
     * @return the sc
     */
    public Scanner getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
}
