/**
 * @author Rodrigo Alvarado
 *
 */
public class AlarmaEmergencia extends Alarma {
	/* (non-Javadoc)
	 * @see Alarma#m1()
	 */
	public void m1() {
		System.out.println("Emergencia1");
	}
	
	/* (non-Javadoc)
	 * @see Alarma#m2()
	 */
	public void m2() {
		super.m1();
		super.m2();
	}
	
	/* (non-Javadoc)
	 * @see Alarma#toString()
	 */
	public String toString() {
		return "Emergencia "+super.toString();
	}
}