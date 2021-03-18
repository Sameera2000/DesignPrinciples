package abstractpattern;

public class AudiFactory extends Factory{
	public Tire makeTire() {
		return new AudiTire();
	}
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}
}
