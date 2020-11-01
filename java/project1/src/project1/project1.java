package project1;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1 , l2 ;
		boolean lb1,lb2;
		boolean k ;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("¿ La tierra es redonda [0] Falso [1] Verdad: ");
		l1 = sc.nextInt();
		
		System.out.print("¿ 25 es un cuadrado perfecto [0] Falso [1] Verdad: ");
		l2 = sc.nextInt();
		
		if(l1==0) {
			lb1=false;
		}else {
			lb1=true;
		}
		
		if(l2==0) {
			lb2=false;
		}else {
			lb2=true;
		}
		
		k=(lb1&&lb2);
		
		System.out.println (" El valor de la variable k es: "+ k ) ;
		
	}

}
