/**
 * Clase base para los posibles alojamientos. Es una clase abstracta por lo que no puede
 * instanciarse como tal.
 * @author Axel
 * @version v1.0
 */
public abstract class Alojamiento {
	private String codigo;
	private static final int PRECIO_POR_DIA = 50;
	private int numPlazas;
	private int suplemento;
	
	/**
	 * Constructor de la clase abstract Alojamiento. Asigna las variables básicas
	 * @param codigo - Código del alojamiento
	 * @param numPlazas - Número de plazas que ocupa el alojamiento
	 * @param suplemento - Cantidad extra a pagar por ese tipo de alojamiento
	 * */
	public Alojamiento(String codigo, int numPlazas, int suplemento) {
		super();
		this.codigo = codigo;
		this.numPlazas = numPlazas;
		this.suplemento = suplemento;
	}

	/**
	 * Devuelve el precio a pagar dependiendo del número de días que se quede.
	 * @param dias - Número de días que alquila
	 * @return A cuánto sale a pagar por esa cantidad de días
	 */
	public abstract double precioAPagar(int dias);
	
	/**
	 * 
	 * @return - Devuelve el código del alojamiento
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @return Devuelve cuánto es el precio por día
	 */
	public static int getPrecioPorDia() {
		return PRECIO_POR_DIA;
	}

	/**
	 * 
	 * @return Devuelve cuántas plazas está ocupando esta vivienda
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * 
	 * @return Devuelve cuánto hay que pagar extra (base) por este tipo de alojamiento
	 */
	public int getSuplemento() {
		return suplemento;
	}
	
	/**
	 * 
	 * @return Devuelve la información sobre el alojamiento
	 */
	@Override
	public String toString() {
		return String.format("codigo: %-8s, precio por dia:%3d, plazas:%3d", codigo, PRECIO_POR_DIA, numPlazas);
	}
	
	
}
