package _day1_Session1_;

public class PhoneOrderRepair implements IProcessOrder,IProcessPhoneRepair,IProcessAccessoryRepair {

	//@Override
	public void ProcessOrder(String modelname) {
		// TODO Auto-generated method stub
		System.out.println(modelname+" Order accepted");
	}

	//@Override
	public void ProcessPhoneRepair(String modelname) {
		// TODO Auto-generated method stub
		System.out.println(modelname+" Repair accepted");
	}

	//@Override
	public void ProcessAccessoryRepair(String accessorytype) {
		// TODO Auto-generated method stub
		System.out.println(accessorytype+" Repair accepted");
	}
}

