package observerPattern;

public class MessageSubscriber3 implements Observer {
	MessagePublisher publish;
	public MessageSubscriber3(MessagePublisher publish) {
		//super();
		this.publish = publish;
		this.publish.attach(this);
	}

	@Override
	public void update() {
		System.out.println("MessageSubscriber3 : "+publish.getState());
	}
}
