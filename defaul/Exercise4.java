package defaul;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		double retiro, Credito = 1000;
		int num;
		System.out.println("Ingrese que operacion desea realizar:" +  "\n1. Retiro" + "\n2. Deposito" + "\n3. Salir");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        switch (num) {
        case 1:
        	System.out.println("¿Cuánto desea retirar?");
        	retiro = sc.nextDouble();
        	if (retiro <= Credito) {
        		Credito -= retiro;
        		System.out.println("Ahora tiene " + Credito + " en su cuenta.");
        	}
        	else {
        		System.out.println("Debe ingresar un monto válido.");
        	}
        break;
        case 2:
        	System.out.println("Ingrese cuanto quiere depositar");
        	double deposito = sc.nextDouble();
        	Credito += deposito;
        	System.out.println("Ahora tiene " + Credito + " en su cuenta.");
        break;
        case 3:
        break;
        }
        
        	
	}

}
