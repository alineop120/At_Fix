/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiadora;

/**
 *
 * @author 364975
 */
public class Pessoa {
    // Atributo
    private String nome;
    private int idade;
    private String endereco;
    
    // Construtor
    public Pessoa(String _nome, int _idade, String _end){
        this.nome = _nome;
        this.idade = _idade;
        this.endereco = _end;
    }
    
    // Método
    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    } 
    
    @Override
    public String toString(){
        return ("Nome: "+getNome()+"\nIdade: "+getIdade()+"\nEndereco: "+getEndereco());
    }

    // Get's e Set's
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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
