package 适配器模式;

public class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name + "中锋:进攻");

	}

	@Override
	public void defense() {
		System.out.println(name + "中锋:防守");

	}

}
