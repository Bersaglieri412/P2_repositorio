
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

/*******************************************************************
* Nombre de la clase: CrearCSV
* Descripción de la clase: Su funcion es realizar una tabla de Excel con los datos de la complejidad en ns y ms.
*******************************************************************/

public class CrearCSV {
	
	/*******************************************************************
	* Nombre del método: inciar
	* Descripción del método: Crea el .csv con los tiempos de complejidad
	* Argumentos de llamada: Queue<String> q 
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones: FileNotFoundException e
	*******************************************************************/
	
	public static void iniciar(Queue<String> q){

	
	try (PrintWriter writer = new PrintWriter("resultadosComplejidad.csv")) {

	      StringBuilder sb = new StringBuilder();
	      sb.append("Resolucion imagen;Tiempo ns; Tiempo ms\n");
	      while(!q.isEmpty()) sb.append(q.poll());
	      
	      writer.append(sb.toString());
	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	    }

	  }
}
