
package matematica;

public class TesteMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica m = new Matematica();
        /*int ma = m.maior(10, 20);
        System.out.println(ma);
        double so = m.soma(10, 20);
        System.out.println(so);*/
        
        double so = m.soma(m.maior(2, 4), m.maior(3, 5));
        System.out.println(so);
        
        double ra = m.raiz(9);
        System.out.println(ra);
    }
    
}
