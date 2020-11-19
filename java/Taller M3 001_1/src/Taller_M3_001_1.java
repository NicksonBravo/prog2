import java.util.Scanner;

public class Taller_M3_001_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 07 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M3011			|");
		System.out.println("+---------------------------------------+");
		System.out.println();

		System.out.println();
		
		Boolean carrera;
		Boolean economia;
		Boolean administracion;
		Boolean ciencias;
		Boolean nombre;
		Boolean semestre;
		double valorcarnet=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese su nombre: ");
		nombre = sc.next();

		System.out.println("ingrese nombre de su carrera: ");
		carrera = sc.nextBoolean();

		System.out.println("ingrese numero de semestre: ");
		semestre=sc.nextBoolean();
		switch (carrera) {
		case "a":
			if (carrera=economia) {
		
			if (semestre<=3) ;{
				valorcarnet = 1500;
			}
			
			if (semestre>=4<=7) ;{
				valorcarnet = 2220;
			}
			else if (semestre>=8<=10) ;{
				valorcarnet = 3000;
			}
			}
			
			break;
		case "b":
			if (carrera=administracion) {
		
			if (semestre<=3) ;{
				valorcarnet = 2000;
			}
			
			if (semestre>=4<=7) ;{
				valorcarnet = 4000;
			}
			else if (semestre>=8<=10) ;{
				valorcarnet = 6000;
			}
		}	
			break;
			case "c":
				if (carrera=ciencias) {
			
				if (semestre<=3) ;{
					valorcarnet = 1800;
				}
				
				if (semestre>=4<=7) ;{
					valorcarnet = 5000;
				}
				else if (semestre>=8<=10) ;{
					valorcarnet = 7000;
				}
		}
			break;
		}
		System.out.println("estudiante: "+nombre);
		System.out.println("carrera: "+carrera);
		System.out.println("semestre actual: "+semestre);
		System.out.println("valor carnet: "+valorcarnet);
	
	}
}



