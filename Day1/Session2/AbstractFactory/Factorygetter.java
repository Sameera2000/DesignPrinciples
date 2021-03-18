package abstractpattern;

public class Factorygetter {
	public static Factory getFactoryname(String name) {
		if(name.equals("audi")) {
			return new AudiFactory();
		}
		else if(name.equals("mercedes")) {
			return new MercedesFactory();
		}
		return null;
	}
}
