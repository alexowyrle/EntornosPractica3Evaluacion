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
	 * Constructor de la clase abstract Alojamiento. Asigna las variables b�sicas
	 * @param codigo - C�digo del alojamiento
	 * @param numPlazas - N�mero de plazas que ocupa el alojamiento
	 * @param suplemento - Cantidad extra a pagar por ese tipo de alojamiento
	 * */
	public Alojamiento(String codigo, int numPlazas, int suplemento) {
		super();
		this.codigo = codigo;
		this.numPlazas = numPlazas;
		this.suplemento = suplemento;
	}

	/**
	 * Devuelve el precio a pagar dependiendo del n�mero de d�as que se quede.
	 * @param dias - N�mero de d�as que alquila
	 * @return A cu�nto sale a pagar por esa cantidad de d�as
	 */
	public abstract double precioAPagar(int dias);
	
	/**
	 * 
	 * @return - Devuelve el c�digo del alojamiento
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @return Devuelve cu�nto es el precio por d�a
	 */
	public static int getPrecioPorDia() {
		return PRECIO_POR_DIA;
	}

	/**
	 * 
	 * @return Devuelve cu�ntas plazas est� ocupando esta vivienda
	 */
	public int getNumPlazas() {
		return numPlazas;
	}

	/**
	 * 
	 * @return Devuelve cu�nto hay que pagar extra (base) por este tipo de alojamiento
	 */
	public int getSuplemento() {
		return suplemento;
	}
	
	/**
	 * 
	 * @return Devuelve la informaci�n sobre el alojamiento
	 */
	@Override
	public String toString() {
		return String.format("codigo: %-8s, precio por dia:%3d, plazas:%3d", codigo, PRECIO_POR_DIA, numPlazas);
	}
	
	
}
