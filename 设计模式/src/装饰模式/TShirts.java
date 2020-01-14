package 装饰模式;

public class TShirts extends Finery {

	@Override
	public void show() {
		System.out.println("大T恤");
		super.show();
	}
}
