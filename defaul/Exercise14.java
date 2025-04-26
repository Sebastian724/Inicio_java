package defaul;
import java.util.Scanner;
public class Exercise14 {

	public static void main(String[] args) {
		int num,neg=0;
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<10;i++) {
			System.out.println("Ingrese un numero");
			num=scanner.nextInt();
			if (num<0) {
				neg++;
			}
		}
		System.out.println("Existen "+neg+"numeros negativos");

	}

}
