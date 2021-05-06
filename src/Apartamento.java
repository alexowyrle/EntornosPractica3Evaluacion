
/**
 * Nombre clase: Apartamento el cual hereda de Alojamiento y nos va a servir
 * para alamcenar los datos pertenecientes a los atributos de esta clase.
 * @author Diego Orta
 * @version v1.0
*/

/**
 * Extiende de la clase padre Alojamiento y hereda sus atributos además del 
 * siguiente
 */
public class Apartamento extends Alojamiento{

	private int gastosComunidad;
	
	

	public Apartamento(String codigo, int numPlazas, int gastosComunidad) {
		super(codigo, numPlazas, 0);
		this.gastosComunidad = gastosComunidad;
	}
	/**
	 * En los apartamentos se calcula el suplemento por día
	 * dividiendo la cuota mensual de los gastos de comunidad por 30 y 
	 * multiplicarla por el número de días que se han alquilado
	 * @param dias
	 * @return double
	 */
	@Override
	public double precioAPagar(int dias) {
		
		return getPrecioPorDia()*dias + (double)gastosComunidad*dias/30;
		
	}
	
	/**
	 * Metodo que devuelve el valor de todos los atributos mostrandolos en 
	 * una sola linea
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + String.format(", %-23s%5d", "Gastos de comunidad:", gastosComunidad);
	}
}
