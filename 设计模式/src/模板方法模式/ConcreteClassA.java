package 模板方法模式;

public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("具体类A实现方法1");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("具体类A实现方法2");
	}

}
