// CC2006, Lab 4
// Una clase para representar a los militares en general.

/**
 * @author Rodrigo Alvarado
 *
 */
public class Militar {
    /**
     * @return horas
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    
    /**
     * @return salario
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
    
    /**
     * @return dias de vacacionces
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }

    /**
     * @return formulario
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
    
    /**
     * @return todo lo concerniente al militar
     */
    public String imprimirTodo(){
    	String x ="-------\nTrabaja "+ this.getHoras() + " a la semana\nGana " + this.getSalario() + " al año\nTiene " + this.getDiasVacaciones() + "dias de vacaciones al anio\nEl formulario es: " + this.getFormularioVacaciones();
    	return x;
    }
}
