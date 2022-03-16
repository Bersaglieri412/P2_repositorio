/*******************************************************************
* Nombre de la clase: main
* Descripci�n de la clase: Ser� la encargada de ejecutar el programa.
*******************************************************************/

public class main {

	/*******************************************************************
	* Nombre del m�todo: main 
	* Descripci�n del m�todo: Su funci�n es ejecutar los m�todos necesarios para el programa, en este caso menu().
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static void main(String[] args) {
		menu();
		
	}
	
	/*******************************************************************
	* Nombre del m�todo: menu 
	* Descripci�n del m�todo: Permite selecionar una ejecuci�n, dando a elegir como opcines: crear una matriz de dimension potencia de 2
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
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
