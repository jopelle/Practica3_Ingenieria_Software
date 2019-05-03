
public abstract class Alojamiento {
	
	protected String descripcion;
	protected int numDias;
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public abstract int coste();
}
