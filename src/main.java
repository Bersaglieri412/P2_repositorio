/*******************************************************************
* Nombre de la clase: main
* Descripción de la clase: Será la encargada de ejecutar el programa.
*******************************************************************/

public class main {

	/*******************************************************************
	* Nombre del método: main 
	* Descripción del método: Su función es ejecutar los métodos necesarios para el programa, en este caso menu().
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static void main(String[] args) {
		menu();
		
	}
	
	/*******************************************************************
	* Nombre del método: menu 
	* Descripción del método: Permite selecionar una ejecución, dando a elegir como opcines: crear una matriz de dimension potencia de 2
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
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
