package 模板方法模式;

public abstract class AbstractClass {
	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	public void templateMethod() {
		System.out.println("执行模板方法");
		primitiveOperation1();
		primitiveOperation2();

	}
}
