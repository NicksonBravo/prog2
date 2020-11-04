import java.util.Scanner;

public class M2008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2008			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		String trabajador ;
		
		double dias_trabajados, valor_por_hora , numero_horas, salario_pagado, horas_extras,trabajadas_horas_extras, total_seguro_social , total_pagado;
		int trabajadores;
		
		Scanner sc=new Scanner(System.in) ;
		
		System.out.println("Ingrese numero de trabjadores: ");
		trabajadores=sc.nextInt();
		
		for (int i = 1; i <= trabajadores; i++) {
			
			System.out.println("trabajador # "+i+"");
			
			valor_por_hora = 10000 ;
			horas_extras= valor_por_hora * 2;
			
			
			System.out.println("digite cantidad de horas trabajadas ");
			 numero_horas=sc.nextDouble();
			 
			 System.out.println("digite cantidad de horas extras trabajadas ");
			 trabajadas_horas_extras=sc.nextDouble();
			 
			System.out.println("digite cantidad de dias trabajados "); 
			dias_trabajados=sc.nextDouble();
			
			total_pagado= (valor_por_hora * (numero_horas*dias_trabajados))+ (horas_extras*trabajadas_horas_extras);
			
			total_seguro_social= total_pagado-((total_pagado * 12) / 100 );
			
			System.out.println("salario pagado: "+total_pagado); 
			
			System.out.println("salario pagado con descuento de seguro social aplicado: "+total_seguro_social); 
			
		}
	
				
	}

}
