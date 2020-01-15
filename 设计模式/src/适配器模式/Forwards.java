package 适配器模式;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name + "前锋:进攻");

	}

	@Override
	public void defense() {
		System.out.println(name + "前锋:防守");

	}

}
