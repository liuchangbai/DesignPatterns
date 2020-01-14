package 观察者模式;

public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;

	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();

		System.out.println("观察者的新状态是" + name + "   " + observerState);
	}

	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

}
