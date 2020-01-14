package 代理模式;

public class Proxy implements GiveGift {

	Pursuit gg;

	public Proxy(SchoolGirl mm) {
		this.gg = new Pursuit(mm);
	}

	@Override
	public void GiveDolls() {
		gg.GiveDolls();

	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();

	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();

	}
}
