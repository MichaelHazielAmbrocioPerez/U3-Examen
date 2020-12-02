package u3examen;

public class NodoCola {
    public Object elemento;
	public int indice;
	public NodoCola siguiente;
	
	public NodoCola(Object elemento, int indice) {
		
		this.elemento=elemento;
		this.indice = indice;
	    
		siguiente=null;
    }
}
