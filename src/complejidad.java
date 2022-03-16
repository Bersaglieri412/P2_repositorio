import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Queue;

/*******************************************************************
* Nombre de la clase: complejidad
* Descripción de la clase: Calcula el tiempo de ejecucion en nanosegundos o milisegundos.
*******************************************************************/

public class complejidad {
	
	/*******************************************************************
	* Nombre del método: calculo
	* Descripción del método: Su funcion es calcular la complejidad con el tiempo de ejecucion. 
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static void calculo() {
		Queue<String> q= new LinkedList<String>();
		for(int j=1;j!=11;j++) {
		char[][] i = compresionImagen.matriz((int)Math.pow(2, j));
		ArbolNArio<Character> ar = new ArbolNArio<Character>('º');
		long inicio = System.nanoTime();
	    compresionImagen.compresion(i, ar,0,i.length,0,i.length);
	    long elapsed=System.nanoTime()-inicio;
	    
	    double elapsedm=(double)elapsed/1000000;
	     System.out.println("Resolución "+(int)Math.pow(2, j)+"x"+(int)Math.pow(2, j)+":\t"+elapsed+"ns\t"+elapsedm+"ms");
	    q.add((int)(Math.pow(2, j))+"x"+((int)(Math.pow(2, j)))+";"+elapsed+";"+elapsedm+"\n");
    	}
		CrearCSV.iniciar(q);
		System.out.println("\nResultados exportados a csv");
	}

}
