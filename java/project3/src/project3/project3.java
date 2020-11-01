package project3;

import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l1 , l2 ;
		boolean lb1,lb2;
		boolean k ;
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println ("¿ La tierra es redonda? [0] falso [1] verdad :" ) ;
		
		l1 = sc.nextInt();
		
		System.out.println ("¿ Simón Bolívar ? liberto a panamá [0] falso [1] verdad :") ;
	
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
		
		System.out.println ("El valor de la variable k es :"+k);
		
	}

}
