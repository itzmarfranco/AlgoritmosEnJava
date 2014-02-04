/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

	public static void main(String[] args) {

		int inflimit = Integer.parseInt(args[0].toString());
		int suplimit = Integer.parseInt(args[1].toString());
		int c = inflimit+1;
		String numeros = "";

		while(c<=suplimit){
			if(c<suplimit){
				numeros = numeros+c+",";
			}
			else{
				System.out.println("Límites: (" + inflimit + "," + suplimit + ")");
				System.out.println("Los números dentro del rango son: " + numeros);
			}
			c++;
			
		}
      
	}

}
