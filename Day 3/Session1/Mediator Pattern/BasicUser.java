package mediatorPattern;

public class BasicUser implements IUser {
	
	public IChatMediator chatmediator;
	public String name;
	public BasicUser(IChatMediator chatmediator,String name) {
		this.chatmediator=chatmediator;
		this.name=name;
	}
	@Override
	public void ReceiveMessage(String message) {
		System.out.println("Name of the user:"+name+" and the message received by Basic user is: "+message);
	}

	@Override
	public void SendMessage(String message) {
		chatmediator.SendMessage(message, this);

	}

}
