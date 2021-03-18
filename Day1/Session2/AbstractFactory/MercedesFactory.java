package abstractpattern;

public class MercedesFactory extends Factory{
	public Tire makeTire() {
		return new MercedesTire();
	}
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}
}
