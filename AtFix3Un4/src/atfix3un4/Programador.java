package atfix3un4;


public class Programador extends Empregado {
    private int horasExtra;
    private float valorHora, adicional;
    
    //Construtor
    public Programador(String nome, int horasExtra, float valorHora){
        super(nome);
        this.horasExtra=horasExtra;
        this.valorHora=valorHora;
    }
    
    public void recebe(){
        System.out.println("Digite a hora extra: ");
        setHorasExtra(sc.nextInt());
        System.out.println("Digite o valor da hora extra: ");
        setValorHora(sc.nextFloat());
    }
    
    public void calcAdicional(){
        setAdicional(getValorHora() * getHorasExtra());
    } 
    
    public void mostra(){
        System.out.println("ADICIONAL: " + getAdicional());
    }

    /**
     * @return the horasExtra
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * @param horasExtra the horasExtra to set
     */
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    /**
     * @return the valorHora
     */
    public float getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the adicional
     */
    public float getAdicional() {
        return adicional;
    }

    /**
     * @param adicional the adicional to set
     */
    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    
    
}
