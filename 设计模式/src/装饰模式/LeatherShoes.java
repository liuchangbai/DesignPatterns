package 装饰模式;

public class LeatherShoes extends Finery {
	@Override
	public void show() {
		System.out.println("皮鞋");
		super.show();
	}
}
