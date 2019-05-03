
public class Prueba {

	public static void main(String[] args) {
		/*USRobotsInterface usRobot= new UnUSRobot(2);
		RiojaRobotsInterface riojaRobot=new USaRiojaAdaptador(usRobot);
		
		System.out.println("Tengo una velocidad de: "+riojaRobot.velocidadActualEnKmh()+"Kmh");
		riojaRobot.salta(2);*/
		
		Alojamiento casa=new Premium(5);
		casa=new excursion1(casa);
		casa=new excursion2(casa);
		casa=new salidaTardia(casa);
		
		System.out.println(casa.getDescripcion());
		System.out.println(casa.coste()+"€");
	}
}

