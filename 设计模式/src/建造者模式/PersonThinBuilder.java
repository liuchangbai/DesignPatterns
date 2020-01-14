package 建造者模式;

import java.awt.Graphics;
import java.awt.Panel;

public class PersonThinBuilder extends PersonBuilder {

	@Override
	public void builderHead() {
		System.out.println("画个脑袋");

	}

	@Override
	public void builderBody() {
		System.out.println("画个身体");

	}

	@Override
	public void builderArmLeft() {
		System.out.println("画个左手");

	}

	@Override
	public void builderArmRight() {
		System.out.println("画个右手");

	}

	@Override
	public void builderLegLeft() {
		System.out.println("画个左腿");

	}

	@Override
	public void builderLegRight() {
		System.out.println("画个右腿");

	}

}
