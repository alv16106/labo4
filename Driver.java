
public class Driver {
	public static void main(String[] args) {
		Soldado soldado = new Soldado();
		General general = new General();
		Coronel coronel = new Coronel();
		Teniente teniente = new Teniente();
		System.out.println("Soldado");
		System.out.println(soldado.imprimirTodo());
		System.out.println("General");
		System.out.println(general.imprimirTodo());
		System.out.println("Coronel");
		System.out.println(coronel.imprimirTodo());
		System.out.println("Teniente");
		System.out.println(teniente.imprimirTodo());
		
	}
}
