
package atfix2un4;

public class Calculadora {

    // Método para realizar a operação de soma entre dois números
    public int soma(int n1, int n2) {
        int s = n1 + n2; // Calcula a soma
        return s; // Retorna o resultado da soma
    }
    
    // Método para realizar a operação de multiplicação entre dois números
    public int produto(int n1, int n2) {
        int p = n1 * n2; // Calcula o produto
        return p; // Retorna o resultado do produto
    }  

    // Método para determinar o menor entre dois números
    public int menor(int n1, int n2) {
        if (n1 < n2) {
            return n1; // Se n1 for menor que n2, retorna n1
        } else {
            return n2; // Caso contrário, retorna n2
        }
    }

    // Método para receber dois números e realizar as operações
    public void recebe(int n1, int n2) {
        // Calcula a soma, o produto e determina o menor entre n1 e n2
        int soma = soma(n1, n2);
        int produto = produto(n1, n2);
        int menor = menor(n1, n2);
        // Mostra os resultados das operações na tela
        mostra(soma, produto, menor);
    }

    // Método para exibir os resultados das operações
    public void mostra(int so, int pro, int me) {
        System.out.println("Soma: " + so); // Exibe a soma
        System.out.println("Produto: " + pro); // Exibe o produto
        System.out.println("Menor: " + me); // Exibe o menor número
    }
}

