package 装饰模式;

public class Finery extends Person {

	protected Person component;

	public void decorator(Person component) {
		this.component = component;
	}

	@Override
	public void show() {
		if (component != null) {
			component.show();
		}
	}

}
