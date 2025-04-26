package defaul;
import java.util.Scanner;
public class Exercise13 {

	public static void main(String[] args) {
		int cant, sueldo, s_max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantos sueldos va a ingresar");
		cant = scanner.nextInt();
		while(cant>0) {
			System.out.println("Ingrese el sueldo");
			sueldo =scanner.nextInt();
			if(sueldo>s_max) {
				s_max=sueldo;
			
			}
			cant--;
		}
		System.out.println("El sueldo maximo es: "+s_max);
	}

}
