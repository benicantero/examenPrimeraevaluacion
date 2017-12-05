import java.util.Scanner;

public class Cadena{

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduce una palabra%n");
		String cadenaleida = sc.nextLine ();
		sc.close();	
		String cadenaLeidaMayuscula = cadenaleida.toUpperCase();
		String cadenaLeidaMinuscula = cadenaleida.toLowerCase();
		System.out.printf("La cadena leida \"%s\" es equivalente en minusculas a %s , y en mayusculas a %s%n",cadenaleida,cadenaLeidaMinuscula,cadenaLeidaMayuscula);	
	}
}