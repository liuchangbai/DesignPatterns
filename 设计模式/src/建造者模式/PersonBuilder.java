package 建造者模式;

import java.awt.Graphics;
import java.awt.Panel;

public abstract class PersonBuilder {

	public abstract void builderHead();

	public abstract void builderBody();

	public abstract void builderArmLeft();

	public abstract void builderArmRight();

	public abstract void builderLegLeft();

	public abstract void builderLegRight();

}
