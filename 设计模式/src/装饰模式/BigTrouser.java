package 装饰模式;

public class BigTrouser extends Finery {
	@Override
	public void show() {
		System.out.println("垮裤");
		super.show();
	}
}
