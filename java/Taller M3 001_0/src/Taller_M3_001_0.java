import java.util.Scanner;

public class Taller_M3_001_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 07 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M3010			|");
		System.out.println("+---------------------------------------+");
		System.out.println();

		System.out.println();

		String Nombre;
		double sueldo;
		int categoria;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese Su Nombre: ");
		Nombre = sc.next();

		System.out.println("Ingrese Su Categoria: ");
		categoria = sc.nextInt();

		System.out.println("Ingrese Su Sueldo: ");
		sueldo = sc.nextDouble();
		
		switch (categoria) {
		case 1: 
			sueldo = sueldo * 1.15;				
			break;
		case 2:
			sueldo = sueldo * 1.10;
			break;
		case 3:
			sueldo = sueldo* 1.08;
			break;
		case 4:
			sueldo = sueldo * 1.07;
			break;
		default:
			sueldo = 0 ;
			System.out.println("Categoria no existe: ");
			break;
		}
		
		System.out.println("El sueldo a pagar es: "+sueldo);
		System.out.println("Enter para continuar ....");
		new Scanner(System.in).nextLine();
	}

}
