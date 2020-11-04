import java.util.Scanner;

public class M2004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2004			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		for (int i = 1; i <=3 ; i++) {
			
			double  salario , descuento ;
			String nombre ;
			
			Scanner sc=new Scanner(System.in) ;
			
			System.out.println ( "Digite su  Nombre"+i+": ") ;
			nombre=sc.next();
			
			System.out.println ( "Digite su  su salario:") ;
			salario=sc.nextDouble();
			
			System.out.println ( "Digite su  su descuento:") ;
			descuento=sc.nextDouble();
			
			double total = salario - descuento ;
			
			System.out.println("Nombre : "+nombre);
			System.out.println("salario: "+salario);
			System.out.println("descuento: "+descuento);
			System.out.println("el valor total a cancelar es: "+total);
			
		}
		
		
	}

}
