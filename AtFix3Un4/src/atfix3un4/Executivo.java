package atfix3un4;

public class Executivo extends Empregado {
    private float comisProd;
    
    public Executivo(String nome, float comisProd) {
        super(nome);
        this.comisProd=comisProd;
    }
    
    public void calcProducao(float txPr){
        setComisProd((float) (txPr * getSalario()));
    }
    
    public void mostra(){
        System.out.println("VALOR COMISSÃO: " + getComisProd());
    }

    /**
     * @return the comisProd
     */
    public float getComisProd() {
        return comisProd;
    }

    /**
     * @param comisProd the comisProd to set
     */
    public void setComisProd(float comisProd) {
        this.comisProd = comisProd;
    }
    
    
}

