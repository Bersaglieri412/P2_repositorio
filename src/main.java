
public class main {

	public static void main(String[] args) {
		menu();
		
	}
	public static void menu() {
		System.out.println("Elija una opción del menú:\n1.Método entero\n2.Cálculo complejidad");
		int i=leer.entero();
		switch(i) {
		case 1:
			System.out.println("Se enseñará el funcionamiento completo del método");
			compresionImagen.compresion();
			break;
		case 2:
			System.out.println("Se calculará la complejidad");
			complejidad.calculo();
			break;
		default:
			System.out.println("La opción no corresponde con ninguna propuesta, se cerrará el menú");
			break;
		}
	}
	
}


