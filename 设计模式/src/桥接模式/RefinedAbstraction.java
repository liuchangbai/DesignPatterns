package 桥接模式;

public class RefinedAbstraction extends Abstraction {

	@Override
	public void operation() {
		implementor.operation();
	}

}
