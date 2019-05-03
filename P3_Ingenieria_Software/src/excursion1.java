
public class excursion1 extends extrasDecorator {
	
	public excursion1(Alojamiento a) {
		this.alojamiento=a;
	}
	public int coste() {
		return this.alojamiento.coste()+25;
	}
	
	public String getDescripcion() {
		return this.alojamiento.getDescripcion()+", excurion 1";
	}

}
