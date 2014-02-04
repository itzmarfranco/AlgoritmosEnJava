/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

	public static void main(String[] args) {
		int valorActual = 0;
		int limite = Integer.parseInt(args[0].toString());
   		//si valor actual < args[0]

			while(valorActual<limite){
				System.out.println("El valor actual es: "+ valorActual);
				valorActual++;
			}      
	}
}
