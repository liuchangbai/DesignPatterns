package 适配器模式;

public class ForeignCenter {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void 进攻() {
		System.out.println(name + "外籍中锋:进攻");

	}

	public void 防守() {
		System.out.println(name + "外籍中锋:防守");

	}

}
