

/**
 * Nombre clase: Bungalow el cual hereda de Alojamiento y nos va a servir
 * para alamcenar los datos pertenecientes a los atributos de esta clase.
 * @author Diego Orta
 * @version v1.0
*/


/**
 * Extiende de la clase padre Alojamiento y hereda sus atributos además del 
 * siguiente
 */
public class Bungalow extends Alojamiento{

	private int superficiePorche;
		
	

	public Bungalow(String codigo, int numPlazas, int suplemento, int superficiePorche) {
		super(codigo, numPlazas, suplemento);
		this.superficiePorche = superficiePorche;
	}

	/** 
	 * En los bungalows se suma el suplemento multiplicado por el 
	 * número de plazas independientemente de los días que se hayan 
	 * alquilado
	 * @param dias
	 * @return double
	*/
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + getSuplemento()*getNumPlazas();
	}
	
	
	/**
	 * Metodo que devuelve el valor de todos los atributos mostrandolos en 
	 * una sola linea
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Superficie del porche:", superficiePorche);
	}
}
