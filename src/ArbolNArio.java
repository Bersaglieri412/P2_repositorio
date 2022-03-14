

public class ArbolNArio<T> {
	private T valor;
	
	private ArbolNArio<T>[] hijos;

	public ArbolNArio(int tam) {
		hijos = new ArbolNArio[tam];
	}
	
	public void construir(T val) {
		setValor(val);
	}
	
	public void construir(T val, ArbolNArio[] hijos) {
		setValor(val);
		setHijos(hijos);
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public ArbolNArio<T>[] getHijos() {
		return hijos;
	}

	public void setHijos(ArbolNArio<T>[] hijos) {
		this.hijos=hijos;
	}
	public String preorden(ArbolNArio<Character> ar,int p) {
		String a="";
		if(ar!=null) {
		for(int i =0; i<p;i++)a+="\n";
		for(int i =0; i<p;i++)a+="\t";
		p++;
		a+=ar.getValor();
		if(ar.getHijos()!=null) {
			for(int i=0; i<ar.getHijos().length;i++) a+=preorden(ar.getHijos()[i],p);
		}
		}
		return a;
	}
	public String toString() {		
		String a="";
		ArbolNArio ar = this;
		if(ar!=null) {
			a= a+ar.getValor();
			if(ar.getHijos()!=null) {
				for(int i=0; i<ar.getHijos().length;i++) a+=preorden(ar.getHijos()[i],1);
			}
			}
		return a;
	}
	
}
