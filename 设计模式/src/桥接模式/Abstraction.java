package 桥接模式;

public abstract class Abstraction {

	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public abstract void operation();

}
