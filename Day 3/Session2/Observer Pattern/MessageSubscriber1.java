package observerPattern;

public class MessageSubscriber1 implements Observer {
	MessagePublisher publish;
	
	public MessageSubscriber1(MessagePublisher publish) {
		//super();
		this.publish = publish;
		this.publish.attach(this);
	}

	@Override
	public void update() {
		System.out.println("MessageSubscriber1 : " + publish.getState());
	}
}
