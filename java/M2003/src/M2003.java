import java.util.Scanner;

public class M2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2003			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		for (int i = 1; i <= 3; i++) {
			
			Scanner sc = new Scanner (System.in) ;
			double nota1 , nota2 , nota3 ;
			String nombre;
			
			System.out.println();
			System.out.println("*** Estudiante"+i+" ****");
			System.out.println ( "Digite su  Nombre: ") ;
			nombre=sc.next();
			
			System.out.println ( "Digite su  1er nota:") ;
			
			nota1 = sc.nextDouble();
			
			System.out.println ( "Digite su 2da nota:") ;
			
			nota2 = sc.nextDouble();
			
			System.out.println ( "Digite su 3era nota:") ;
			
			nota3 = sc.nextDouble();
			
			double parcial1=(nota1*30)/100;
			double parcial2=(nota2*30)/100;
			double parcial3=(nota3*40)/100;
			
			double definitiva = (parcial1+parcial2+parcial3) ;
			
			
			System.out.println("Su nombre es:"+ nombre);
			System.out.println("Su 1er nota es: "+ nota1);
			System.out.println("Su 2da nota es: "+ nota2);
			System.out.println("Su 3ra nota es: "+ nota3);
			System.out.println("Su nota definitiva es: "+ definitiva);

		}

		System.out.println("Enter para continuar ....");
		new Scanner(System.in).nextLine();		
	}

}
