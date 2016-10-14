// CC2006, Lab 4
// Una clase para representar a los Coroneles.

/**
 * @author Rodrigo Alvarado
 *
 */
public class Coronel extends Teniente {
    /* (non-Javadoc)
     * @see Militar#getSalario()
     */
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    
    /**
     * 
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
