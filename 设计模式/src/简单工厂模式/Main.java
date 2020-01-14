package 简单工厂模式;

public class Main {
	public static void main(String[] args) throws Exception {
		Operation oper = OperationFactory.createOperate("/");
		oper.setNumberA(15);
		oper.setNumberB(0);
		double result = oper.getResult();
		System.out.println(result);
	}
}
