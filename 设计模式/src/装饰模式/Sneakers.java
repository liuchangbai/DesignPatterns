package 装饰模式;

public class Sneakers extends Finery {
	@Override
	public void show() {
		System.out.println("破球鞋");
		super.show();
	}
}
