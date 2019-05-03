
public class Premium extends Alojamiento {

	public Premium(int dias) {
		this.numDias=dias;
		this.descripcion="Premium";
	}
	public int coste() {
		return 10*this.numDias;
	}
}
