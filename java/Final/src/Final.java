import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 21 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|			PROGRAMA FINAL				|");
		System.out.println("+---------------------------------------+");
		System.out.println();

		System.out.println();
		System.out.println("Digite 1 para el programa m2001 :");
		System.out.println("Digite 2 para el programa m2002 :");
		System.out.println("Digite 3 para el programa m2003 :");
		System.out.println("Digite 4 para el programa m3001_0 :");
		System.out.println("Digite 5 para el programa m3001_2 :");
		System.out.println("Digite 6 para el programa project1 :");
		System.out.println("Digite 7 para el programa project2 :");
		System.out.println("Digite 8 para el programa algebrin :");
		
		try (Scanner sc = new Scanner(System.in)) {
			int opcionprograma;
			String comando = "";
			System.out.println("Digite el nuemro de programa a ejecutar " );
			opcionprograma = sc.nextInt();
			
			
			switch (opcionprograma){
				case 1:
					comando = "m2001";
					break;
				case 2:
					comando = "m2002";
					break;
				case 3:
					comando = "m2003";
					break;
				case 4:
					comando = "m3001_0";
					break;
				case 5:
					comando = "m3001_2";
					break;
				case 6:
					comando = "project1";
					break;
				case 7:
					comando = "project2";
					break;
				case 8:
					comando = "algebrin";
					break;
			}
			try {
				Process p=Runtime.getRuntime().exec("cmd /c start java -jar C:/compilados/"+comando+".jar");
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	
	}

}
