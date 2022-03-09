import java.util.Random;

public class compresionImagen {

	
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
	    compresionImagen.compresion(i, ar);
	    String s = ar.toString();
		for(int j=0;j<s.length();j++) {
			
			if(s.charAt(j)!='º') System.out.println("\t"+s.charAt(j));
			else System.out.println(s.charAt(j));
		}
	}
	public static boolean compararMatriz(char[][] c) {
		boolean seguir=true;
		int n=c.length;
		char a=c[0][0];
		for(int i=0; i<n && seguir;i++) {
			for(int j=0;j<n&&seguir;j++) {
				if(c[i][j]!=a) seguir=false;
			}
		}
		
		
		return seguir;
	}
	public static ArbolNArio<Character> compresion(char[][] c,ArbolNArio<Character> ar) {
		ArbolNArio<Character> a = new ArbolNArio<Character>('º');
		/*for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();*/
		
		//caso base
		if(compararMatriz(c)) {
			ar=new ArbolNArio<Character>(c[0][0]);
			ar.setValor(c[0][0]);
		 }
		else {
			ArbolNArio<Character>[] hijos = new ArbolNArio[4];
			ar.setHijos(hijos);
			ar.setValor('º');
			for(int i =0;i<4;i++) {
				ar.getHijos()[i]=new ArbolNArio<Character>('º');
				ar.getHijos()[i]=compresion(crearSubMatriz(c,i+1),ar.getHijos()[i]);
			}
			
		}
		return ar;
	}
	public static char[][] crearSubMatriz(char[][] c,int a) {
		 char[][]b= new char[c.length/2][c.length/2];
		 switch(a) {
		 case 1:
			 for(int i =0;i<c.length/2;i++) {
				 for(int j=0;j<c.length/2;j++) {
					 b[i][j]=c[i][j];
				 }
			 }
			 break;
		 case 2:
			 for(int i =0;i<c.length/2;i++) {
				 for(int j=c.length/2;j<c.length;j++) {
					 b[i][j-c.length/2]=c[i][j];
				 }
			 }
			 break;
		 case 3:
			 for(int i =c.length/2;i<c.length;i++) {
				 for(int j=0;j<c.length/2;j++) {
					 b[i-c.length/2][j]=c[i][j];
				 }
			 }
			 break;
		 
	case 4:
		 for(int i =c.length/2;i<c.length;i++) {
			 for(int j=c.length/2;j<c.length;j++) {
				 b[i-c.length/2][j-c.length/2]=c[i][j];
			 }
		 }
		 break;
	default:
		System.out.println(a+"No es ningún cuartil");
		b=null;
		break;
	 }
		 return b;
	}
	public static void crearArbol (char[][] c,ArbolNArio<Character> a,int n, int objetivo) {
		ArbolNArio<Character>[] h = new ArbolNArio[4];
		ArbolNArio<Character> def = new ArbolNArio<Character>(4);
		for(int j=0;j<4;j++) h[j]=def;
		//Caso base
		if(n==objetivo) {
			a.setValor('b');
		}
		//General
		else {
			a.setHijos(h);
			a.setValor('º');
			for(int i=0;i<4;i++) crearArbol(c,a.getHijos()[i],n*2,objetivo);
		}
		
	}
	
	public static ArbolNArio<Character>[] crearHijos(ArbolNArio<Character> a) {
		ArbolNArio<Character>[]	h = new ArbolNArio[4];
		
		return h;
	}
	public static ArbolNArio<Character> crearHijos(ArbolNArio<Character> a,ArbolNArio<Character>[] h) {
		a.setHijos(h);
		
		return h[0];
	}
	
	
}
