import java.util.Scanner;

public class M2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2001			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		Scanner sc = new Scanner (System.in) ;
		int n1 ;
		
		System.out.println ( "Digite el numero que dese elevar la cubo:") ;
		n1 = sc.nextInt();
		
	
		double elevado = Math.pow(n1, 3) ;
		
		System.out.println(elevado);
		
	}

}
