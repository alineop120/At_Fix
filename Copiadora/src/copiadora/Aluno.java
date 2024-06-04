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
public class Aluno extends Pessoa {
    // Atributo
    private String semestre;
    private String curso;
    
    // Construtor	
    public Aluno(String _nome, int _idade, String _end) {
        super(_nome, _idade, _end);
    }
    
    // Métodos
    @Override
    public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
	return 0.07 * (double) qtd;
    }
    
    @Override
    public String toString(){
        return (super.toString()+"\nSemestre: "+getSemestre()+"\nCurso: "+getCurso());
    }

    // Get's e Set's
    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    } 
}
