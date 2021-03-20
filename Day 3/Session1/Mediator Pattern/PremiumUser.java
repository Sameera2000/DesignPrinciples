package mediatorPattern;

public class PremiumUser implements IUser {
	
	public IChatMediator chatmediator;
	public String name;
	public PremiumUser(IChatMediator chatmediator,String name) {
		this.chatmediator=chatmediator;
		this.name=name;
	}
	@Override
	public void ReceiveMessage(String message) {
		System.out.println("Name of the user:"+name+" and the message received by Premium user is: "+message);

	}

	@Override
	public void SendMessage(String message) {
		chatmediator.SendMessage(message, this);

	}

}
