/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 1 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

	public static int producto(int valor){
		if ( valor <= 1) {
			return 1;
		}
		else{
			return valor*producto(valor-1);
		}
	}

	public static void main(String[] args) {
		int limite = Integer.parseInt(args[0].toString());
		int resultado = producto(limite);
		int i = 1;
		
	   	String factores = "";

		while(i<=limite){
			if(i<limite){
				factores = factores + i+"x";
			}
			else{
				factores = factores + i;

			   	System.out.println("El producto es: "+factores+" = "+resultado);
			}
			i++;

		}
      
   }

}
