
public class excursion2 extends extrasDecorator {

	public excursion2(Alojamiento a) {
		this.alojamiento=a;
	}
	public int coste() {
		return this.alojamiento.coste()+50;
	}
	
	public String getDescripcion() {
		return this.alojamiento.getDescripcion()+", excurion 2";
	}

}
