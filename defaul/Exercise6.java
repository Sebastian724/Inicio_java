package defaul;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese un numero: ");
		num = sc.nextInt();
		while(true) {
			if (num%2==0 && num!=0) {
				System.out.println("El numero es par");
			}
			else if (num==0){
				break;
			}
			else {
				System.out.println("El numero es impar");
			}
			System.out.println("Ingrese otro numero");
			num = sc.nextInt();
		}
		
	}

}
