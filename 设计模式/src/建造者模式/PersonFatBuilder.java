package 建造者模式;

import java.awt.Graphics;
import java.awt.Panel;

public class PersonFatBuilder extends PersonBuilder {

	@Override
	public void builderHead() {
		System.out.println("画个胖脑袋");

	}

	@Override
	public void builderBody() {
		System.out.println("画个胖身体");

	}

	@Override
	public void builderArmLeft() {
		System.out.println("画个粗左手");

	}

	@Override
	public void builderArmRight() {
		System.out.println("画个粗右手");

	}

	@Override
	public void builderLegLeft() {
		System.out.println("画个粗左腿");

	}

	@Override
	public void builderLegRight() {
		System.out.println("画个粗右腿");

	}

}
