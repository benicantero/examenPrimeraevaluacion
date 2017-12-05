import java.util.Scanner;
/** Examen primera evaluacion
* Realizamos el programa
* @param 
* @author Benigno Cantero
* @version 1.0
*/
public class Numeros{
	
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Introduce dos numeros entre 0 y 1000%n");
		int numero1 = sc.nextInt ();
		int  numero2 = sc.nextInt ();
		sc.close();
		System.out.printf("Primer numero leido %d, segundo numero leido %d%n",numero1,numero2);
		if (comprobarNumeros( numero1, numero2)){
			System.out.printf("El mayor de los dos es %d%n",cualEsMayor(numero1,numero2));
			diezPrimerosMultiplosDeTres(numero1);
			esCapicua (numero1);
		} else{
			System.out.printf("No podemos continuar%n");
			System.out.printf("Los numeros introducidos no son validos%n");
			System.out.printf("Fin de programa%n");
		}
	}
	/**Metodo que comprueba si los numeros estan comprendidos 
	*entre el rango permitido (1 y 999)
	*/
	public static boolean comprobarNumeros(int numero1,int numero2){
		return numero1>0 && numero2<=1000;
	}
	
	/**Metodo que calcual cual es mayor 
	*de los dos y muestra en consola su valor
	*/
	public static int cualEsMayor(int numero1, int numero2){
		int mayor = 0;
		if (numero1 >= numero2){
			mayor = numero1;
		}else{
			mayor = numero2;
		}
		return mayor;
	}
	
	/**Metodo que muesta por consola los diez 
	*primeros multiplos del numero1
	*/
	public static void diezPrimerosMultiplosDeTres(int numero1){
		int multiplo = 0;
		System.out.printf("Los diez primeros multiplos de %d son%n",numero1);
		for ( int i=1 ; i<=10 ; i++ ){
			multiplo = i * 3 * numero1;
			System.out.printf("1 X 3 X %d = %d%n",numero1,multiplo);
		}
	}
	
	
	/**Metodo que calcula si un numero es capicua
	*utiliza el modulo del numero entre 10 para "deconstruir" el numero digito a digito
	*y posteriormente lo vuelve a construir multiplicando por 10 y sumando el resto para que quede igual
	*/
	public static void esCapicua (int numero){
		int a = 0;
		int b = 0;
		int k = numero;
		while(numero!=0){    
			a = numero % 10;
			b = b * 10 + a;
			numero = numero/10;
     	}
     	System.out.println("Al darle la vuelta al numero obtenemos :" + b);
		if(b==k)
			System.out.println ("Es capicua ");
		else
		System.out.println ("No es capicua ");
		}
}