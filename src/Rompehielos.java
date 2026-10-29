import java.util.Scanner;
public class Rompehielos {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduzca su nombre completo: ");
		String nombre = lector.nextLine();
		int edad = 0;
		boolean condicion = true;
		while (condicion) {
			System.out.print("Introduzca su edad: ");
			if (lector.hasNextInt()) {
				edad = lector.nextInt();
				if (edad >= 0) {
					condicion = false;
				} else {
					System.out.println("Su número tiene que ser mayor a cero (por obvias razones).");
					condicion = true;
				}
			} else {
				System.out.println("Tiene que introducir un número en dígitos.");
				condicion = true;
			}
			lector.nextLine();
		}
		System.out.printf("Su nombre es: %s %n Su edad es: %d %n", nombre, edad);
	}
}
