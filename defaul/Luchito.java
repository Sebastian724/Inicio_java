package defaul;
import java.util.Scanner;
public class Luchito {

	public static void main(String[] args) {
		
		Scanner aea = new Scanner (System.in);
		
		int numero = aea.nextInt();
		System.out.println("Tu numero es:"+numero);
		int numero2 = 5;
		int numero3 = 6;
		int suma = numero2 + numero3;
		int resta = numero2 - numero3;
		int multiplicacion = numero2 * numero3;
		double division = numero2 / numero3;
		double modulo = numero2 % numero3;
		System.out.println(suma + resta + multiplicacion + division + modulo);
		// TODO Auto-generated method stub

	}

}
