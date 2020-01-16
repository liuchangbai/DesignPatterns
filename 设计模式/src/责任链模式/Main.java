package 责任链模式;

public class Main {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();

		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		int[] request = { 2, 5, 14, 25, 28, 3, 27, 31 };

		for (int i : request) {
			h1.handlerRequest(i);
		}
	}
}
