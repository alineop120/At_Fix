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
public class Professor extends Pessoa{
    //Atributo
    private String disciplina;
    
    // Construtor
    public Professor(String _nome, int _idade, String _end) {
        super(_nome, _idade, _end);
    }
    
    @Override
    public double tirarCopias(int qtd) { //Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }
    
    @Override
    public String toString(){
        return (super.toString()+"\nDisciplina: "+disciplina);
    }
    
}
