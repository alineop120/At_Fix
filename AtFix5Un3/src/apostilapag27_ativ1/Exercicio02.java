/*
                    ----- INFORMAÇÕES DA QUESTÃO 02 -----
    Faça uma classe executável que dados a distância percorrida (em Km) e o 
tempo gasto em uma viagem (em horas) e calcule e informe a velocidade média do 
carro, sabendo que: 
    Velocidade = delta_S / delta_T (variação de distância / variação do tempo).

 */
package apostilapag27_ativ1;

import java.util.Scanner;

public class Exercicio02 {
    //Variavéis
    double distancia, tempo, velocMedia;
    
    Scanner sc = new Scanner(System.in);
    
    public void recebeDados() {
        // Receber os dados da distância e o tempo do percurso
        System.out.println("Digite a distância percorrida (em Km):");
        distancia = sc.nextDouble();

        System.out.println("Digite o tempo gasto na viagem (em horas):");
        tempo = sc.nextDouble();
    }
    public void calcVelocMedia() {
        velocMedia = distancia / tempo; // Calcular a velocidade média
    }
    
    public void mostraResult() {
        // Mostrar o resultado da fórmula
        System.out.println("Velocidade média do carro: "+velocMedia);
    }
}
