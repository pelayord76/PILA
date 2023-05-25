package pila;

import java.util.ArrayList;
import java.util.Iterator;

import error.PilaLLenaException;

public class Pila {
	private ArrayList<Integer> numeros;
	boolean llena;
	boolean vacia;

	public Pila() {
		super();
		numeros = new ArrayList<Integer>();
		llena = false;
		vacia = true;
	}

	/**
	 * metodo que añade un numero que le llega como parametro, en caso de que la
	 * pila no haya llegado al tamaño limite de 30, se añadira al principio de esta.
	 * tras añadirlo se setea el boolean 'llena' por si se hubiese llenado.
	 * 
	 * @param numero numero ingresado a l pila
	 * @throws PilaLLenaException si la pila ya tenia el tamaño limite, se lanzara
	 *                            una excepcion
	 */
	public void add(int numero) throws PilaLLenaException {

		try {
			if (!llena) {
				numeros.add(0, numero);
				setLlena(isLlena());
				setVacia(isVacia());
			}
			else {
				PilaLLenaException error = new PilaLLenaException("La pila ha llegado a su tamaño maximo.");
				throw error;
			}
			
		}
		catch (PilaLLenaException e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que extrae el ultimo numero añadido, para ello coge el primer numero
	 * del array y lo borra a la vez que lo devuelve. tras extraerlo se setea el
	 * boolean 'vacia' por si se hubiese vaciado.
	 * 
	 * @return numero extraido
	 */
	public Integer get() {
		int devolver;

		if (!vacia) {
			devolver = numeros.get(0);
			numeros.remove(0);
			setVacia(isVacia());
			return devolver;
		} else
			return null;
	}

	/**
	 * getter que comprueba si la pila esta llena, mirando si su tamaño es 30, de no
	 * serlo, no lo está.
	 * 
	 * @return true o false.
	 */
	public boolean isLlena() {
		if (numeros.size() == 30)
			llena = true;
		else
			llena = false;

		return llena;
	}

	public void setLlena(boolean llena) {
		this.llena = llena;
	}

	/**
	 * getter que comprueba si la pila esta vacia, mirando si su tamaño es igual a
	 * 0.
	 * 
	 * @return
	 */
	public boolean isVacia() {
		if (numeros.size() == 0)
			vacia = true;
		else
			vacia = false;

		return vacia;
	}

	public void setVacia(boolean vacia) {
		this.vacia = vacia;
	}

	/**
	 * metodo para saber cuantos elementos tiene la pila.
	 * 
	 * @return
	 */
	public int getSize() {
		return numeros.size();
	}

	/**
	 * coge el iterator para usarlo al volcar los datos al fichero.
	 * 
	 * @return
	 */
	public Iterator<Integer> getIterator() {
		return numeros.iterator();
	}

	/**
	 * imprime el estado de la pila.
	 */
	@Override
	public String toString() {
		return ">> " + numeros + " ";
	}
}
