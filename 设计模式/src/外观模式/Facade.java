package 外观模式;

public class Facade {

	private SubSystem1 subSystem1;

	private SubSystem2 subSystem2;

	private SubSystem3 subSystem3;

	private SubSystem4 subSystem4;

	public Facade() {
		subSystem1 = new SubSystem1();
		subSystem2 = new SubSystem2();
		subSystem3 = new SubSystem3();
		subSystem4 = new SubSystem4();
	}

	public void MethodA() {
		System.out.println("方法组A");
		subSystem1.method1();
		subSystem2.method2();
		subSystem4.method4();
	}

	public void MethodB() {
		System.out.println("方法组B");
		subSystem2.method2();
		subSystem3.method3();
	}
}
