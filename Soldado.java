
/**
 * @author Rodrigo Alvarado
 *
 */
public class Soldado extends Militar {
    /* (non-Javadoc)
     * @see Militar#getSalario()
     */
    public double getSalario() {
        return super.getSalario() - 10000.0;      // Q30,000.00 / anio
    }
    /* (non-Javadoc)
     * @see Militar#getHoras()
     */
    public int getHoras() {
        return super.getHoras()*2;           // trabaja 80 horas / semana
    }
    
    /* (non-Javadoc)
     * @see Militar#getDiasVacaciones()
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones()/2;           // 2 semanas de vacaciones pagadas
    }

    /**
     * @return orden
     */
    public String recibeOrden() {
        return "Ordene mi General!";     // Recibe ordenes
    }
}
