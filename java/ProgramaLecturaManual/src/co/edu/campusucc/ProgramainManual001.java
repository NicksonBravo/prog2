package co.edu.campusucc;

import java.util.Scanner;

public class ProgramainManual001 {
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 25 / Octubre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  CONVERSIÓN		|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		String tipo="";
		double decimal=0.0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese (H)exadecimal ó (B)inario:");
		tipo=sc.next();
		
		System.out.print("Ingrese un numero Decimal:");
		decimal=sc.nextDouble();
		
		if(tipo.equals("H")){
			String hexadecimal="";
			int numero=(int) Math.floor(decimal);
			hexadecimal=Integer.toHexString(numero);
			System.out.println("El numero en Hexadecimal es : "+hexadecimal);
		}else if(tipo.equals("B")) {
			String binario="";
			int numero=(int) Math.floor(decimal);
			binario=Integer.toBinaryString(numero);
			System.out.println("El numero en Binario es :"+binario);
		}
		
	}
}
