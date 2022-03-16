import java.util.Random;

/*******************************************************************
* Nombre de la clase: compresionImagen
* Descripción de la clase: Se encargará de comprimir la mariz o comparar la matriz
*******************************************************************/

public class compresionImagen {

	/*******************************************************************
	* Nombre del método: matriz 
	* Descripción del método: Mediante el valor de entrada se creara una matriz cubica de tamaño bxb y se completara con 
	* 		Random.nextBoolean, siendo B=1 y N=0
	* Argumentos de llamada: int b
	* Valor de retorno: char[][] i
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static char[][] matriz(int b) {
		char[][] i = new char[b][b];
		Random r = new Random();
		for(int a=0;a<b;a++) {
			for(int j=0;j<b;j++) {
				if(r.nextBoolean())i[a][j] = 'B';
				else i[a][j] = 'N';
			}
		}
		return i;
	}
	
	/*******************************************************************
	* Nombre del método: compresion 
	* Descripción del método: Creará una matriz del tamaño deseado potencia de 2, y se llamará al metodo matriz para completarla,
	* 		a continuacion se mostrará por pantalla y se llamará al metodo compararMatriz(char[][] c,int iF,int fF,int iC,int fC)
	* 		y mostrará la matriz comprimida
	* Argumentos de llamada: -
	* Valor de retorno: -
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static void compresion() {
		boolean seguir=true;
		int b=0;
		while(seguir) {
		System.out.println("Introduzca un número potencia de dos para crear una matriz cuadrada:");
		b= leer.entero();
		if(Math.log(b)/Math.log(2) % 1 !=0)  System.out.println("El número ha de ser potencia de 2");
		else seguir=false;
		}
		char[][] i = compresionImagen.matriz(b);
		for(int a=0;a<b;a++) {
			for(int j=0;j<b;j++) {
				System.out.print(i[a][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		
		ArbolNArio<Character> ar = new ArbolNArio('º');
	    compresionImagen.compresion(i, ar,0,i.length,0,i.length);
	  	System.out.println(ar.toString(0));
	}
	
	/*******************************************************************
	* Nombre del método: compararMatriz 
	* Descripción del método: Comparará la matriz con los parametros indicados y devolverá true en caso de que 
	* 		todos los datos sean similares y false si la matriz tiene cuadrantes de distinto color
	* Argumentos de llamada: char[][] c,int iF (inicio fila),int fF (fin fila),int iC (inicio colmuna),int fC (fin colmuna).
	* Valor de retorno: boolean seguir
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static boolean compararMatriz(char[][] c,int iF,int fF,int iC,int fC) {
		boolean seguir=true;
				char a=c[iC][iF];
				for(int i=iC; i<fC && seguir;i++) {
					for(int j=iF;j<fF&&seguir;j++) {
						if(c[i][j]!=a) seguir=false;
					}
				}
		return seguir;}
	
	/*******************************************************************
	* Nombre del método: ArbolNArio 
	* Descripción del método: si la matriz es monocromo
	* Argumentos de llamada: char[][] c,ArbolNArio<Character> ar,int iF (inicio fila),int fF (fin fila),
	* 		int iC (inicio colmuna),int fC (fin colmuna).
	* Valor de retorno: ArbolNArio<Character> ar
	* Archivos requeridos: -
	* Lista de excepciones:-
	*******************************************************************/
	
	public static ArbolNArio<Character> compresion(char[][] c,ArbolNArio<Character> ar,int iF,int fF,int iC,int fC) {
		//caso base
		if(compararMatriz(c,iF,fF,iC,fC)) {
			ar=new ArbolNArio<Character>(c[iC][iF]);
			ar.setValor(c[iC][iF]);
		 }
		else {
			ArbolNArio<Character>[] hijos = new ArbolNArio[4];
			ar.setHijos(hijos);
			ar.setValor('º');
			for(int i=0;i<4;i++) ar.getHijos()[i]=new ArbolNArio<Character>('º');
				ar.getHijos()[0]=compresion(c,ar.getHijos()[0],iF,fF/2,iC,fC/2);
				ar.getHijos()[1]=compresion(c,ar.getHijos()[1],iF+((fF-iF)/2),fF,iC,fC/2);
				ar.getHijos()[2]=compresion(c,ar.getHijos()[2],iF,fF/2,iC+((fC-iC)/2),fC);
				ar.getHijos()[3]=compresion(c,ar.getHijos()[3],iF+((fF-iF)/2),fF,iC+((fC-iC)/2),fC);
			}
					
		return ar;
	}
	
}
