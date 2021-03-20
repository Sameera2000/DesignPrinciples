package mediatorPattern;


import java.util.ArrayList;
public class ChatMediator implements IChatMediator {
	ArrayList<IUser> users=new ArrayList<>();
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String message, IUser sender) {
		for(IUser user:users){
			if(user!=sender)
			user.ReceiveMessage(message);
		}

	}

}
