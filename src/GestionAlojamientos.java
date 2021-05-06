import java.util.ArrayList;


/**
 * Clage gestora de los alojamientos. Contiene el main
 * @author Axel
 * @version v1.0
 */
public class GestionAlojamientos {

	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Alojamiento> alojamientos = new ArrayList<>();
		Alojamiento alojamiento;
		crearAlojamientos(alojamientos);

		mostrarAlojamientos(alojamientos);
		System.out.println();
		alojamiento = new Caravana("car01", 4, 2, 750);
		AltaAlojamiento(alojamientos, alojamiento);
		System.out.println();
		alojamiento = new Caravana("car05", 7, 2, 1250);
		AltaAlojamiento(alojamientos, alojamiento);
		mostrarAlojamientos(alojamientos);

		calculaPrecioAlquiler(alojamientos);
		mostrarPreciosDeTodos(alojamientos);
	}//main

	/**
	 * Crea una serie de alojamientos y los añade a una colección
	 * @param alojamientos - Colección con los alojamientos existentes
	 */
	public static void crearAlojamientos(ArrayList<Alojamiento> alojamientos) {
		alojamientos.add(new Caravana("car01", 4, 2, 750));		
		alojamientos.add(new Bungalow("bung01", 4, 3, 12));
		alojamientos.add(new Bungalow("bung02", 2, 3, 8));
		alojamientos.add(new Caravana("car02", 6, 2, 850));
		alojamientos.add(new Apartamento("apart01", 4, 130));
		alojamientos.add(new Apartamento("apart02", 6, 140));
		alojamientos.add(new Bungalow("bung03", 6, 3, 15));
		alojamientos.add(new Bungalow("bung04", 8, 3, 20));
		alojamientos.add(new Apartamento("apart03", 5, 135));
		alojamientos.add(new Apartamento("apart04", 8, 170));
		alojamientos.add(new Caravana("car03", 4, 2, 750));
		alojamientos.add(new Caravana("car04", 3, 2, 750));
	}//crearAlojamientos

	/**
	 * Recorre los alojamientos y muestra la información sobre ellos
	 * @param alojamientos - Colección con los alojamientos existentes
	 */
	public static void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
		System.out.println("Listado de los datos de los alojamientos");
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i));
		}

	}//mostrarAlojamientos

	/**
	 * Añade un alojamiento a la colección de alojamientos si este no está añadido previamente
	 * (mismo código de identificación)
	 * @param alojamientos - Colección con los alojamientos existentes
	 * @param alojamiento - Alojamiento a añadir
	 */
	public static void AltaAlojamiento(ArrayList<Alojamiento> alojamientos, Alojamiento alojamiento) {
		int posicion = buscar(alojamientos,alojamiento);

		if(posicion == -1) {
			alojamientos.add(alojamiento);
		}else {
			System.out.println("Alojamiento con código repetido. No se puede añadir");
		}


	}//AltaAlojamiento

	/**
	 * Busca en la colección de alojamientos si ya existe o no uno con ese código
	 * @param alojamientos - Colección con los alojamientos existentes
	 * @param alojamiento - Alojamiento a comprobar
	 * @return -1 si no existe. La posición si ya está añadido
	 */
	public static int buscar(ArrayList<Alojamiento> alojamientos,Alojamiento alojamiento) {
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(alojamiento.getCodigo())) {
				return i;
			}
		}
		return -1;
	}//buscar
	
	/**
	 * Imprime el precio para un alojamiento en concreto y un número de días
	 * @param alojamientos - Colección con los alojamientos existentes
	 */
	public static void calculaPrecioAlquiler(ArrayList<Alojamiento> alojamientos) {
		// Los datos de entrada serán el código del alojamiento y
		// el número de días que ha durado el alquiler
		String codigo;
		int dias, posAlojamiento;
		codigo = Leer.pedirCadena("Codigo del alojamiento:");
		posAlojamiento = -1;
		for(int i = 0; i < alojamientos.size(); i++) {
			if(alojamientos.get(i).getCodigo().equals(codigo)) {
				posAlojamiento = i;
			}
		}
		if(posAlojamiento != -1) {
			do {
				dias = Leer.pedirEntero("Dias de alquiler:");
			}while(dias < 0);
			System.out.println(codigo + " --> " + alojamientos.get(posAlojamiento).precioAPagar(dias));
		}
	}//calculaPrecioAlquiler


	/**
	 * Muestra el precio a pagar por cada alojamiento existente en un número de días
	 * @param alojamientos - Colección con los alojamientos existentes
	 */
	public static void mostrarPreciosDeTodos(ArrayList<Alojamiento> alojamientos) {
//		 Se da como dato de entrada un número de días de alquiler y 
//		 se obtiene un listado con los datos de cada alojamiento y lo que costaría su alquiler 
//		 para el número de días indicado
		int dias;
		do {
			dias = Leer.pedirEntero("Dias de alquiler:");
		}while(dias < 0);
		for(int i = 0; i < alojamientos.size(); i++) {
			System.out.println(alojamientos.get(i).getCodigo() + " --> " + alojamientos.get(i).precioAPagar(dias));
		}
	}//mostrarPreciosDeTodos
}
