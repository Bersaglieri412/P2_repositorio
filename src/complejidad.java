import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Queue;

public class complejidad {
	
	public static void calculo() {
		Queue<String> q= new LinkedList<String>();
		for(int j=1;j!=11;j++) {
		char[][] i = compresionImagen.matriz((int)Math.pow(2, j));
		ArbolNArio<Character> ar = new ArbolNArio<Character>('º');
		long inicio = System.nanoTime();
	    compresionImagen.compresion(i, ar,0,i.length,0,i.length);
	    long elapsed=System.nanoTime()-inicio;

	    double elapsedm=elapsed/(1*Math.pow(10, 6));
	    
	    
	    q.add((int)(Math.pow(2, j))+"x"+((int)(Math.pow(2, j)))+";"+elapsed+";"+elapsedm+"\n");
    	}
		CrearCSV.iniciar(q);
		System.out.println("Resultados exportados a csv");
	}

}
