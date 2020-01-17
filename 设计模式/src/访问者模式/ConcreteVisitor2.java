package 访问者模式;

public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitorConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName() + "被" + this.getClass().getName() + "访问!");

	}

	@Override
	public void visitorConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName() + "被" + this.getClass().getName() + "访问!");

	}

}
