import java.util.Scanner;

public class Taller_M3_001_5 {

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

		String ubicacion;
		String tamano;
		double costo=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su ubicación: ");
		ubicacion = sc.next();
		
		System.out.println("Ingrese su tamaño: ");
		tamano = sc.next();
		
		switch (ubicacion) {
		case "norte":
			switch (tamano) {
			case "pequeño":
				costo= 500;
				break;
			case "mediano":
				costo= 250;
				break;
			case "grande":
				costo= 100;
				break;
			}
			break;
		case "sur":
			switch (tamano) {
			case "pequeño":
				costo= 400;
				break;
			case "mediano":
				costo = 200;
				break;
			}
			
			break;
		case "oriente grande":
			switch (tamano) {
			default: costo= 100;
			break;
			}
		case "occidente":
			switch (tamano){
				case "pequeño":
					costo= 300 ;
					break;
				case "grande" :
					costo = 200;
			}
			
			break;
		
		}
		System.out.println("su tarifa por minuto local es: "+costo);
	} 
	
}


