package builder;

public abstract class Burger implements Item {

	@Override
	public String name() {
		return null;
	}
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	public abstract float price();

}
