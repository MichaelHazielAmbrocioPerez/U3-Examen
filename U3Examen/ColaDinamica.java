package u3examen;

public class ColaDinamica {
    
    public  NodoCola cima,fin;
	public  int tamanio;
	
	public boolean EstaVacia() {
		return cima == null;
	}
	
	public void Empujar(String elemento, int indice) {
		NodoCola nodo = new NodoCola(elemento,indice);
		if(EstaVacia()) {
			cima = nodo;
		}else {
			fin.siguiente = nodo;
		}
		fin = nodo;
		tamanio++;
	}
	public String SacarCola() {
		if(!EstaVacia()) {
			cima = cima.siguiente;
			tamanio--;
		}else {
			System.out.println("No hay clientes comunes en la cola");
		}
		return null;
	}
	public void MostrarCola() {
		NodoCola recorre = cima;
		if(!EstaVacia()) {
			while(recorre!=null) {
				System.out.print(" [ Cliente : "+recorre.elemento +", turno: "+ recorre.indice+ " ] ");
				recorre = recorre.siguiente;
			}
		}else {
			System.out.println("La cola comun esta vacía");
		}
		
	}
	public String SacarUnElemento() {
		String v = null;
		NodoCola recorre = cima;
		if(!EstaVacia()) {
			
				v= ("[Cliente: "+recorre.elemento +" Turno: "+ recorre.indice+" ] ");
				return v;
			
		}else {
			System.out.println("La cola comun esta vacía");
			
		}
		return v;
	}
    
}
