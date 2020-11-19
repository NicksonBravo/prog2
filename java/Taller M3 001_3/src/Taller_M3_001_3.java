import java.util.Scanner;

public class Taller_M3_001_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 07 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M3013			|");
		System.out.println("+---------------------------------------+");
		System.out.println();

		System.out.println();
		
		String producto;
		int cantidad;
		cantidad = 0;
		double precio = 0;
		double iva = 0;
		double operacion=0.0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese nombre producto producto: ");
		producto= sc.next();

		System.out.println("ingrese Cantidad producto: ");
		cantidad=sc.nextInt();
		
		switch (producto) {
		case "a":
			if (cantidad<501) {
				precio = 500;
				iva = 0.7;
				
			}
			else if (cantidad>500) {
				precio= 1000;
				iva= 0.9;
			}
			break;
		case "b" :
			if (cantidad<501) {
				precio = 800;
				iva = 0.8;
						
			}
			else if (cantidad>500){
				precio= 1400;
				iva = 0.11;
			}
			break;
			
		case "c":
			if (cantidad<501) {
				precio= 1000;
				iva= 0.5;
			}
			else if (cantidad<500){
				precio= 1600;
				iva= 0.10;
			}	
			break;
		}
		
		operacion = ((cantidad*precio)+((cantidad*precio)*iva));
		
		System.out.println("el valor de su factura es: "+operacion);
	}
}
