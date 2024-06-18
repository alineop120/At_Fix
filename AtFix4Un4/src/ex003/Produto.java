package ex003;

/**
 *
 * @author Aline
 */
public class Produto {
    private int codigo;
    private String descricao;
    private int quantidadeDisponivel;
    private int quantidadeMinima;
    private double precoVenda;

    /**
     * Construtor da classe Produto.
     * 
     * @param codigo             Código do produto.
     * @param descricao          Descrição do produto.
     * @param quantidadeMinima   Quantidade mínima desejada em estoque.
     * @param precoVenda         Preço de venda do produto.
     */
    public Produto(int codigo, String descricao, int quantidadeMinima, double precoVenda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidadeMinima = quantidadeMinima;
        this.precoVenda = precoVenda;
        this.quantidadeDisponivel = 0; // Inicialmente, o estoque está vazio
    }

    /**
     * Método para repor o estoque do produto.
     * 
     * @param quantidade Quantidade comprada para reposição.
     */
    public void reporEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeDisponivel += quantidade;
            System.out.println("Estoque reposto com sucesso.");
        } else {
            System.out.println("Quantidade inválida para reposição.");
        }
    }

    /**
     * Método para alterar o preço de venda do produto baseado em uma taxa percentual.
     * 
     * @param taxa Taxa percentual de alteração do preço.
     */
    public void alterarPreco(double taxa) {
        if (taxa > 0) {
            precoVenda *= (1 + taxa / 100);
            System.out.println("Preço de venda alterado com sucesso.");
        } else {
            System.out.println("Taxa inválida para alteração de preço.");
        }
    }

    /**
     * Método para dar baixa na quantidade disponível do produto após uma venda.
     * 
     * @param quantidade Quantidade vendida.
     * @return true se a baixa foi realizada com sucesso, false se não há estoque suficiente.
     */
    public boolean darBaixa(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeDisponivel) {
            quantidadeDisponivel -= quantidade;
            double valorVenda = quantidade * precoVenda;
            System.out.println("Venda realizada com sucesso. Valor total: R$ " + valorVenda);
            return true;
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
            return false;
        }
    }

    /**
     * Método que verifica se é necessário repor o estoque do produto.
     * 
     * @return true se a quantidade disponível for menor ou igual à quantidade mínima, false caso contrário.
     */
    public boolean precisaRepor() {
        return quantidadeDisponivel <= quantidadeMinima;
    }

    // Getters e setters (não usados no programa principal, mas úteis para manipulação externa)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}