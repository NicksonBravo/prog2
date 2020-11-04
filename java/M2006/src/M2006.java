import java.util.Scanner;

public class M2006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2006			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		String nombre ;
		double valor_hora , horas_trabajadas , salario ;
		
		for (int i = 1; i <=3 ; i++) {
			
			Scanner sc=new Scanner(System.in) ;
			
			System.out.println("Digite nombre "+i+"");
			
			nombre= sc.next() ;
			
			System.out.println("Digite valor de Hora");
			
			valor_hora = sc.nextDouble();
			
			System.out.println("Digite horas trabajadas");
			
			horas_trabajadas = sc.nextDouble();
			
			
			salario= valor_hora * horas_trabajadas ;
			
			System.out.println("Total salario: "+salario);
			
			
		}
		
		
				
	}

}
