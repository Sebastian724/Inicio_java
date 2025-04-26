package defaul;

import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		double num,res;
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("Ingrese un número");
			num = sc.nextDouble();
			if (num >=0) {
				res = num*num;
				System.out.println("El cuadrado es: "+res);
			}
			else {
				System.out.println("El numero es negativo");
			break;
			}
			
		}
	}

}
