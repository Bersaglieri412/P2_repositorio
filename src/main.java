
public class main {

	public static void main(String[] args) {
		menu();
		
	}
	public static void menu() {
		System.out.println("Elija una opci�n del men�:\n1.M�todo entero\n2.C�lculo complejidad");
		int i=leer.entero();
		switch(i) {
		case 1:
			System.out.println("Se ense�ar� el funcionamiento completo del m�todo");
			compresionImagen.compresion();
			break;
		case 2:
			System.out.println("Se calcular� la complejidad");
			complejidad.calculo();
			break;
		default:
			System.out.println("La opci�n no corresponde con ninguna propuesta, se cerrar� el men�");
			break;
		}
	}
	
}


