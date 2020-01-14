package 工厂方法模式;

public class Main {
	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		System.out.println("大学生");
		student.sweep();
		student.buyRice();
		student.wash();

	}
}
