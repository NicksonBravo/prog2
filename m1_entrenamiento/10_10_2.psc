Proceso reunion10_2
	// Defino Variables
	Definir a , b Como Entero;
	a <- 0 ; b <- 1 ;
	Definir s Como Logico;
	
	Escribir " ¿ El sol es una estrella? [0] falso [1] verdadero"; leer a ;
	Escribir " ¿ La luna es un satelite? [0] falso [1] verdadero" ; leer b ;
	s <- (a <= b) ;
	Escribir " El valor final de s es: " , s ;
	
FinProceso
