package array2;

import tablas.Tablas;

public class Clase2 {
	
	public Clase2 () {
		int[] array = llenarArreglo();
		System.out.println("Areglo completo: ");
		imprimir(array);
		
		int[] array2 = quitarDigito(array, 5);
		
		System.out.println("Arreglo nuevo: ");
		imprimir(array2);
	}
	
	private int[] quitarDigito(int[] arrayCompleto, int numeroQuitar) {
		int tamanoArrayNuevo = arrayCompleto.length - 1;
		int arrayNuevo[] = new int[tamanoArrayNuevo];
		int posicionArregloNuevo = 0;
		for (int j = 0; j < arrayCompleto.length; j++) {
			
			if(arrayCompleto[j] != numeroQuitar) {
				arrayNuevo[posicionArregloNuevo] = arrayCompleto[j];
				posicionArregloNuevo++; 
			}
		}
		return arrayNuevo;
	}

	private  int[] llenarArreglo() {
		int num = 10;
		int array[] = new int[num];
		for (int n = 0; n < array.length; n++) {
			array[n] = n;
		}
		return array;
	}
	
	private void imprimir(int[] array) {
		for (int n = 0; n < array.length; n++) {
			System.out.println(array[n] + " ");
		}
	}
	
	public static void main(String[] args) {
		new Clase2();
}
}

//1. crear un  metodo que llene un arreglo del 0 al 9
//2. quitarle un numero al arreglo
//3. imprimir