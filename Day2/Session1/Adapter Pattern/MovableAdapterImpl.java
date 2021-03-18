package adapterpattern;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars=luxuryCars;
	}
	@Override
	public double getspeed() {
		double mph=luxuryCars.getspeed();
		return convertMPHtoKMPH(mph);
	}
	private double convertMPHtoKMPH(double mph) 
	{ 
		return mph * 1.60934; 
	}
	@Override
	public double getprice() {
		double euro=luxuryCars.getprice();
		return convertUSDtoEURO(euro);
	}
	private double convertUSDtoEURO(double euro) {
		return euro*0.84;
	}
}
