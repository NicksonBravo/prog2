import java.util.Scanner;

public class M2002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2002			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		Scanner sc = new Scanner (System.in) ;
		int n1 , n2 ;
		int suma , resta , producto , promedio ;
		
		System.out.println ( "Digite su nota:") ;
		
		
		n1 = sc.nextInt();
		
		System.out.println ( "Digite su nota:") ;
		
		n2 = sc.nextInt();
		
		suma = n1 + n2 ;
		resta = n1 - n2 ;
		producto = n1 * n2 ;
		promedio = suma / 2 ;
		System.out.println("la suma de sus notas es : "+suma);
		System.out.println("la resta de sus notas es: "+resta);
		System.out.println("el producto de sus notas es: "+producto);
		System.out.println("el promedo de sus notas es: "+promedio);
		
		
	}

}
