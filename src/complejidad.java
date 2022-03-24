import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Queue;

/*******************************************************************
* Nombre de la clase: complejidad
* Descripci�n de la clase: Calcula el tiempo de ejecucion en nanosegundos o milisegundos.
*******************************************************************/

public class complejidad {
	
	/*******************************************************************
	* Nombre del m�todo: calculo
	* Descripci�n del m�todo: Su funcion es calcular la complejidad con el tiempo de ejecucion. Para ello 
	* se llamar� al m�todo compresi�n con matrices cuyo orden se ir� incrementando en 2^n hasta 1024.
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static void calculo() {
		Queue<String> q= new LinkedList<String>();
		for(int j=1;j!=11;j++) {
		char[][] i = compresionImagen.matriz((int)Math.pow(2, j));
		ArbolNArio<Character> ar = new ArbolNArio<Character>('�');
		long inicio = System.nanoTime();
	    compresionImagen.compresion(i, ar,0,i.length,0,i.length);
	    long elapsed=System.nanoTime()-inicio;
	    
	    double elapsedm=(double)elapsed/1000000;
	    String elapsedms=String.valueOf(elapsedm).replace('.', ',');
	     System.out.println("Resoluci�n "+(int)Math.pow(2, j)+"x"+(int)Math.pow(2, j)+":\t"+elapsed+"ns\t"+elapsedms+"ms");
	    q.add((int)(Math.pow(2, j))+"x"+((int)(Math.pow(2, j)))+";"+elapsed+";"+elapsedms+"\n");
    	}
		CrearCSV.iniciar(q);
		System.out.println("\nResultados exportados a csv");
	}

}
