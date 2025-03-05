package defaul;
import java.util.Scanner;
public class Luchito {

	public static void main(String[] args) {
		double Pers1, Pers2, Pers3, resul;
		Scanner sc = new Scanner( System.in);
		System.out.print("Ingrese el salario de Guillermo: " );
		Pers1 = sc.nextDouble();
		Pers2 = Pers1/2;
		Pers3 = (Pers1 + Pers2)/2;
		resul = Pers1 + Pers2 + Pers3;
		System.out.println("La suma es: "+resul);
		
		
	    
		

	}
 
}
