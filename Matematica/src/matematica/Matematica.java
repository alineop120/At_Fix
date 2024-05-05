package matematica;

public class Matematica {
    // Maior que um número
    public int maior(int um, int dois){
        if(um > dois){
            return um;
        } else {
            return dois;
        }
    }
    // Soma de dois números
    public double soma(double um, double dois){
        double s = um + dois;
        return s;
    }
    // Raiz quadrada
    public int raiz(int num){
        double r = Math.sqrt(num);
        return (int) r;
    }
    // Números Romanos
    /*
    public string romano(int num){
        
    }
    */
}
