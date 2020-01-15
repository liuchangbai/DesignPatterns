package 适配器模式;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name + "后卫:进攻");

	}

	@Override
	public void defense() {
		System.out.println(name + "后卫:防守");

	}

}
