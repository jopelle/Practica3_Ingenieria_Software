
public class salidaTardia extends extrasDecorator {

	public salidaTardia(Alojamiento a) {
		this.alojamiento=a;
	}
	
	public int coste() {
		return this.alojamiento.coste()+100;
	}
	
	public String getDescripcion() {
		return this.alojamiento.getDescripcion()+", salida tardia";
	}

}
