//actualizado
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

public class CrearCSV {
	
	public static void iniciar(Queue<String> q){

	
	try (PrintWriter writer = new PrintWriter("resultadosComplejidad.csv")) {

	      StringBuilder sb = new StringBuilder();
	      sb.append("Resolucion imagen;Tiempo\n");
	      while(!q.isEmpty()) sb.append(q.poll());
	      
	      writer.append(sb.toString());
	    } catch (FileNotFoundException e) {
	      System.out.println(e.getMessage());
	    }

	  }
}
