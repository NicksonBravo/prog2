
public class M2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+---------------------------------------+");
		System.out.println("|	Autor:	Nickson  Bravo Cortes	|");
		System.out.println("|	Fecha:	 01 / Noviembre / 2020	|");
		System.out.println("+---------------------------------------+");
		System.out.println("|	PROBLEMA  M2007			|");
		System.out.println("+---------------------------------------+");
		System.out.println();
		
		System.out.println();
		
		int paginas, minutos , horas_trabajadas ,paginas_trabajadas, cantidad_pag, cantidad_minu;
		paginas = 15 ;
		minutos = 30 ;
		
		horas_trabajadas = 2*60 ;
		paginas_trabajadas = 75 ;
		
		cantidad_pag = (paginas * horas_trabajadas) / minutos ; 
		cantidad_minu =(paginas_trabajadas * minutos) / paginas ;		
		System.out.println(" cantidad de paginas en 2 horas: "+cantidad_pag);
		
		System.out.println(" cantidad de minutos para 75 paginas : "+cantidad_minu);
		
	}

}
