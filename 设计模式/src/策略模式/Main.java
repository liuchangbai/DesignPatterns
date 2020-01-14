package 策略模式;

public class Main {
	public static void main(String[] args) {
		CashContext cc = new CashContext("满300返100");
		
		double result = cc.getResult(1000);
		System.out.println(result);
	}
}
