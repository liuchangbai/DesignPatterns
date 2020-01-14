package 装饰模式;

public class Main {
	public static void main(String[] args) {
		Person xc = new Person("小菜");

		System.out.println("第一种装扮!");
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();

		pqx.decorator(xc);
		kk.decorator(pqx);
		dtx.decorator(kk);
		dtx.show();
	}
}
