package defaul;
import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
		int notas, notas_may=0,notas_men=0, notas_4=0;
		Scanner scanner= new Scanner(System.in);
		for(int i = 1;i<=6;i++) {
			System.out.println("Ingrese la nota");
			notas = scanner.nextInt();
			if (notas>4) {
				notas_may++;
			}
			else if(notas<4){
				notas_men++;
			}
			else {
				notas_4++;
			}
			
				
		}
		System.out.println("La cantidad de aprobados es: "+notas_may);
		System.out.println("La cantida de condicionados es: "+notas_4);
		System.out.println("La cantidad de desaprobados es: "+notas_men);

	}

}
