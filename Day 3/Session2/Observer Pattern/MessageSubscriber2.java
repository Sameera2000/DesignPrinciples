package observerPattern;

public class MessageSubscriber2 implements Observer {
	MessagePublisher publish;
	public MessageSubscriber2(MessagePublisher publish) {
		//super();
		this.publish = publish;
		this.publish.attach(this);
	}

	@Override
	public void update() {
		System.out.println("MessageSubscriber2 : "+publish.getState());
	}
}
