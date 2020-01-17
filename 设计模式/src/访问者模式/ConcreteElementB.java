package 访问者模式;

public class ConcreteElementB extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitorConcreteElementB(this);
	}

	public void operationB() {

	}
}
