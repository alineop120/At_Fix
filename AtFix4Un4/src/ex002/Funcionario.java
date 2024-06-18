/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex002;

/**
 *
 * @author Aline
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    private String nivelCargo;

    /**
     * Construtor da classe Funcionario.
     * 
     * @param nome Nome do funcionário.
     * @param salarioBase Salário-base do funcionário.
     * @param nivelCargo Nível do cargo do funcionário (I, II ou III).
     */
    public Funcionario(String nome, double salarioBase, String nivelCargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivelCargo = nivelCargo;
    }

    /**
     * Retorna o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do funcionário.
     * 
     * @param nome Novo nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o salário-base do funcionário.
     * 
     * @return O salário-base do funcionário.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Modifica o salário-base do funcionário.
     * 
     * @param salarioBase Novo salário-base do funcionário.
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna o nível do cargo do funcionário.
     * 
     * @return O nível do cargo do funcionário.
     */
    public String getNivelCargo() {
        return nivelCargo;
    }

    /**
     * Modifica o nível do cargo do funcionário.
     * 
     * @param nivelCargo Novo nível do cargo do funcionário (I, II ou III).
     */
    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    /**
     * Calcula o adicional por nível de cargo do funcionário.
     * 
     * @return O adicional calculado com base no nível de cargo.
     */
    public double calcularAdicional() {
        switch (nivelCargo) {
            case "II":
                return salarioBase * 0.10;
            case "III":
                return salarioBase * 0.15;
            default:
                return 0.0; // Não há adicional para nível I
        }
    }

    /**
     * Calcula o desconto de Imposto de Renda (IRRF) sobre o salário-bruto do funcionário.
     * 
     * @return O valor do desconto de IRRF calculado.
     */
    public double calcularIRRF() {
        double salarioBruto = salarioBase + calcularAdicional();

        if (salarioBruto <= 1499.99) {
            return 0.0; // Não há desconto de IRRF para salário até 1499.99
        } else if (salarioBruto <= 1999.99) {
            return salarioBruto * 0.075; // 7.5% de desconto para salário até 1999.99
        } else if (salarioBruto <= 2999.99) {
            return salarioBruto * 0.15; // 15% de desconto para salário até 2999.99
        } else {
            return salarioBruto * 0.20; // 20% de desconto para salário acima de 3000.00
        }
    }

    /**
     * Calcula o desconto de Previdência Social (INSS) sobre o salário-bruto do funcionário.
     * 
     * @return O valor do desconto de INSS calculado.
     */
    public double calcularINSS() {
        double salarioBruto = salarioBase + calcularAdicional();

        if (salarioBruto <= 999.99) {
            return salarioBruto * 0.05; // 5% de desconto para salário até 999.99
        } else if (salarioBruto <= 1799.99) {
            return salarioBruto * 0.09; // 9% de desconto para salário até 1799.99
        } else if (salarioBruto <= 3500.00) {
            return salarioBruto * 0.11; // 11% de desconto para salário até 3500.00
        } else {
            return 385.00; // Teto de 385.00 para salário acima de 3500.00
        }
    }

    /**
     * Calcula o salário líquido do funcionário após descontos de IRRF e INSS.
     * 
     * @return O salário líquido calculado.
     */
    public double calcularSalarioLiquido() {
        double salarioBruto = salarioBase + calcularAdicional();
        double irrf = calcularIRRF();
        double inss = calcularINSS();

        return salarioBruto - irrf - inss;
    }

    /**
     * Mostra o contracheque completo do funcionário, incluindo salário-base, adicional,
     * descontos de IRRF e INSS, e o salário líquido final.
     */
    public void mostrarContracheque() {
        double adicional = calcularAdicional();
        double irrf = calcularIRRF();
        double inss = calcularINSS();
        double salarioLiquido = calcularSalarioLiquido();

        System.out.println("Contracheque de " + nome);
        System.out.println("Salário-base: R$ " + salarioBase);
        System.out.println("Adicional (" + nivelCargo + "): R$ " + adicional);
        System.out.println("IRRF: R$ " + irrf);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}