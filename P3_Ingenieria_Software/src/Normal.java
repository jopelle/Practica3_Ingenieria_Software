
public class Normal extends Alojamiento {
	
	public Normal(int dias) {
		this.numDias=dias;
		this.descripcion="Normal";
	}
	public int coste() {
		return 10*this.numDias;
	}

}
