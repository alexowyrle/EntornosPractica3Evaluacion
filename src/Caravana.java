
/**
 /**
 * Nombre clase: Caravana el cual hereda de Alojamiento y nos va a servir
 * para alamcenar los datos pertenecientes a los atributos de esta clase.
 * @author Javier Sebastián
 * @version v1.0
*/
/**
 * Extiende de la clase padre Alojamiento y hereda sus atributos además del 
 * siguiente 
 */

public class Caravana extends Alojamiento{

	int pesoMaximo;

	

	public Caravana(String codigo, int numPlazas, int suplemento, int pesoMaximo) {
		super(codigo, numPlazas, suplemento);
		this.pesoMaximo = pesoMaximo;
	}

	/** 
	 * En las caravanas se paga el precio base por dia mas un suplemento de 2 euros
	 * multiplicado por el numero de plazas y dias que han estado alquilados 
	 * @param dias
	 * @return double
	*/
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas()*dias;
	}
	
	/**
	 * Metodo que devuelve el valor final de todos los atributos mostrandolos en 
	 * una sola linea
	 * @return String
	 */

	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "PesoMaximo:",pesoMaximo);
	}