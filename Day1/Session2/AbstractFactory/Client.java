package abstractpattern;

public class Client {
	public void getname(String name) {
		Tire tire=Factorygetter.getFactoryname(name).makeTire();
		tire.getTire();
		Headlight light=Factorygetter.getFactoryname(name).makeHeadlight();
		light.getHeadlight();
		
	}
}
