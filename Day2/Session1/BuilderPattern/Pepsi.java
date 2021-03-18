package builder;

public class Pepsi extends ColdDrink{
	@Override
	public float price() {
		return 32.0f;
	}
	@Override
	public String name() {
		return "Pepsi";
	}

}
