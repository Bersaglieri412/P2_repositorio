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
	    compresionImagen.compresion(i, ar,0,i.length,0,i.length);
	  	System.out.println(ar.toString(0));
	}
	
	public static boolean compararMatriz(char[][] c,int iF,int fF,int iC,int fC) {
		boolean seguir=true;
				char a=c[iC][iF];
				for(int i=iC; i<fC && seguir;i++) {
					for(int j=iF;j<fF&&seguir;j++) {
						if(c[i][j]!=a) seguir=false;
					}
				}
		return seguir;}
	
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
