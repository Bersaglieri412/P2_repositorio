/** Clase para poder leer del teclado cualquier dato del tipo que sea de los siguientes:
  * Entero, Double, Float, Cadena, Carï¿½cter, Boolean
  */


import java.util.*;

/*******************************************************************
* Nombre de la clase: leer
* Descripción de la clase: Es la clase encargada de generar un archivo
*******************************************************************/

public class leer{

    private static final Scanner TECLADO=new Scanner(System.in);

    public static void p(String s){ //metodo encargado de mostrar por pantalla un String 
          System.out.println(s);
    }
   	
    public static int entero(){ 
		return entero("");
	}
    public static String String() { 
    	return TECLADO.next();
    }
    
    /*******************************************************************
	* Nombre del método: entero
	* Descripción del método: 
	* Argumentos de llamada: String s
	* Valor de retorno: res
	* Archivos requeridos: 
	* Lista de excepciones: Exception e 
	*******************************************************************/

	public static int entero(String s){
		int res=0;
		boolean vale=true;
		do{
           vale=true;
           p(s);
           try{
        	   res=TECLADO.nextInt();
        	   p(res+"");
           }    	                           
           catch (Exception e) {
        	   vale=false; 
               TECLADO.next();
           }
		}while(!vale);
        TECLADO.nextLine();
 		return res;
	}

	public static int positivo(String s) {
		int res=entero(s+". El valor introducido debe ser mayor que 0");
		while (res<=0) {
			System.out.println("Has introducido un dato erróneo. Inténtalo de nuevo. Recuerda que debe ser mayor que 0");
			res=entero("");
		}
		return res;
	}

	public static int entero(String s, int min, int max){
		int res;
		do{
			res=entero(s+" ["+min+","+max+"]");
		}while(res<min || res>max);
		return res;
	}

}

