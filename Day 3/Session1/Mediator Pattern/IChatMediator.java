package mediatorPattern;

public interface IChatMediator {
	public void AddUser(IUser user);
	public void SendMessage(String message,IUser sender);
}
