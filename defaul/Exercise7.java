package defaul;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		int rand, num;
		
		
		
		rand = (int)(Math.random()*100);
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		num = sc.nextInt();
		while (num!= rand) {
			if (num>rand){
				System.out.print("El numero es mayor, ingresa otro: ");
			}
			else if (num<rand) {
				System.out.print("El numero es menor, ingrese otro: ");
			}
			else {
				System.out.print("El numero ingresado no esta entre 0 y 100, ingrese otro: ");
			}
			num = sc.nextInt();
		}
		System.out.println("Adivinaste");

	}

}
