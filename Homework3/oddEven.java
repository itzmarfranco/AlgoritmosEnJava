/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
	float n = Float.parseFloat(args[0].toString());
	if(n%2 == 0){
		// si el numero es par
		System.out.println("El número es par");
	}
   		// si el numero es impar
	else if(n%2 == 1 || n%2 == -1){
		System.out.println("El número es impar");
	}
	else{
		System.out.println("El número no es entero");
	}
   }
}
