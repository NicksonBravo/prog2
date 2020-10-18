Proceso Diez_10_4
	Definir  resp1 , resp2 , resp3 , resp4 , k Como logico ; 
	Escribir  "¿Benjamin Franklin invento el pararrayos? [0]...Falso [1]...Verdadero";
	Leer resp1 ;
	Escribir  "¿Samuel Morse invento el telegrafo? [0]...Falso [1]...Verdadero";
	leer resp2 ;
	escribir "¿Peru es un país suramericano? [0]...Falso [1]...Verdadero";
	Leer  resp3 ;
	Escribir  "¿5 es un numero primo? [0]...Falso [1]...Verdadero";
	leer resp4 ;
	
	SI (resp1 = resp2) Y (resp3 = resp4) Entonces
		k <- Verdadero;
	SiNo
		k <- Falso;
	FinSi
	Escribir "El valor final es ", k; 
	
FinProceso
