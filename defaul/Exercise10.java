package defaul;
import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		int  mayor_18=0, mayor_175=0;
		double alt=0, est_media,niños=5,edad=0,edad_media, sum_edad=0, sum_alt=0;
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("Ingrese las edades");
			edad= scanner.nextDouble();
			System.out.println("Ingrese las alturas");
			alt = scanner.nextDouble();
			sum_edad +=edad;
			sum_alt+=alt;
			if (edad>18){
				mayor_18++;
				
			}
			if(alt>1.75) {
				mayor_175++;
			}
		}
		edad_media= sum_edad/niños;
		est_media= sum_alt/niños;
		System.out.println("Hay "+mayor_18+" alumnos mayores de 18");
		System.out.println("Hay "+mayor_175+" alumnos mayores de 1.75");
		System.out.println("La media es: "+(int)edad_media);
		System.out.println("La Altura media es: "+est_media);
	}

}
