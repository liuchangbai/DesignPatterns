package 适配器模式;

public class Main {
	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.attack();
		
		Player ym = new Translator("姚明");
		
		ym.defense();
		ym.attack();
	}
}
