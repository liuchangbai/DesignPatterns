package 装饰模式;

public class Tie extends Finery {
	@Override
	public void show() {
		System.out.println("领带");
		super.show();
	}
}
