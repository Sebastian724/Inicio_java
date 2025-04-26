package defaul;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		double med,cant=0, num, suma=0;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Ingrese un numero positivo");
			num = sc.nextDouble();
			suma +=num;
			cant++;
		} while (num >=0);
		
		med = (suma-num) /(cant-1);
		System.out.println("La media es: "+med);
		
	}

}
