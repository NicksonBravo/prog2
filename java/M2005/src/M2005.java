import java.util.Scanner;

public class M2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2005			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		for (int i = 1; i <=2 ; i++) {
			
			double articulo ,  pago , devo ;
			 
			
			Scanner sc=new Scanner (System.in);
			
			System.out.println("digite valor del articulo # "+i+"");
			
			articulo= sc.nextDouble() ;
			
			System.out.println("digite valor de dinero");
			
			pago= sc.nextDouble() ;
			
			devo = pago - articulo ;
			
			System.out.println("su devuelta es: "+devo);
			
		}
		
	}

}
