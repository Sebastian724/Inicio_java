package defaul;
import java.util.Scanner;
public class Exercise11 {

	public static void main(String[] args) {
		 int articulo, mayor_600=0;
		 double litros, precio, conteo_fact,facturacion=0, cant_liters1=0;
		 Scanner scanner = new Scanner (System.in);
		 for(int i=1; i<=5; i++) {
			 System.out.println("Ingrese el artículo");
			 articulo = scanner.nextInt();
			 System.out.println("Ingrese la cantidad vendida");
			 litros= scanner.nextDouble();
			 System.out.println("Ingrese el precio");
			 precio= scanner.nextDouble();
			 conteo_fact = litros*precio;
			 facturacion+=conteo_fact;
			 if(articulo==1) {
				 cant_liters1+=conteo_fact;
			
			 }
			 if(conteo_fact>600) {
				 mayor_600++;
			 }
			 
		 }
		 System.out.println("La facturacion total fue de: "+facturacion);
		 System.out.println("La cantidad de articulos vendidos del articulo 1 fue de: "+cant_liters1);
		 System.out.println("La cantidad de facturas que emitieron mas de 600 fue de: "+mayor_600);
		
		
		

	}

}
