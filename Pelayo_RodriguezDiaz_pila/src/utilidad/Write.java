package utilidad;

import java.io.FileWriter;
import java.util.Iterator;

public class Write {

	/**
	 * metodo que recibe los datos de la pila en forma de iterator y un fichero en
	 * el que volcarlos, lee los elementos de la pila y los va añadiendo al fichero.
	 * 
	 * @param fichero fichero al que vuelca los datos
	 * @param pila iterador con los elementos de la pila
	 */
	public void volcarDatos(String fichero, Iterator<Integer> pila) {
		FileWriter fw;

		try {
			fw = new FileWriter(fichero);
			fw.write(">> ");
			while (pila.hasNext()) {
				fw.write(pila.next().toString() + " ");
			}
			fw.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
