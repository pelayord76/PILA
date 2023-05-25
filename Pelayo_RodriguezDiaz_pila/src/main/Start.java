package main;

import error.PilaLLenaException;
import pila.Pila;
import utilidad.Write;

public class Start {

	public static void main(String[] args) throws PilaLLenaException {

		// ficheros que se usaran para volcarles los datos.
		final String SALIDA_1 = "C:\\Users\\Pelayo\\Clase\\Programacion\\Practica\\salida1.txt";
		final String SALIDA_2 = "C:\\Users\\Pelayo\\Clase\\Programacion\\Practica\\salida2.txt";
		
		Pila pila = new Pila();
		Write write = new Write();

		// se añaden 40 numeros aleatorios
		for (int i = 0; i < 40; i++) {
			pila.add((int) (Math.random() * 100));
		}
		// se imprime por pantalla
		System.out.println(pila);
		// se vuelca a un fichero 'salida1.txt'.
		write.volcarDatos(SALIDA_1, pila.getIterator());
		
		// se extraen 10 elementos
		for (int i = 0; i < 10; i++) {
			pila.get();
		}
		// se imprime por pantalla.
		System.out.println(pila);
		// se vuelca a un fichero 'salida2.txt'.
		write.volcarDatos(SALIDA_2, pila.getIterator());
		

		// se extraen 30 elementos
		for (int i = 0; i < 30; i++) {
			pila.get();
		}
		// se imprime por pantalla.
		System.out.println(pila);
	}
}
