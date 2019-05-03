
public class USaRiojaAdaptador implements RiojaRobotsInterface{
	private USRobotsInterface USRobot;
	
	public USaRiojaAdaptador(USRobotsInterface robot) {
		this.USRobot=robot;
	}
	
	public double velocidadActualEnKmh() {
		return USRobot.currentSpeedInMilesPerHour()*1.6;
	}

	public void salta(double distancia) {
		System.out.println("I jump a distance: "+distancia*0.3+" m");
	}
}
