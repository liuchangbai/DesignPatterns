package 装饰模式;

public class Suit extends Finery {
	@Override
	public void show() {
		System.out.println("西服");
		super.show();
	}
}
