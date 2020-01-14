package 建造者模式;

//指挥者
public class PersonDirector {
	private PersonBuilder personBuilder;

	public PersonDirector(PersonBuilder personBuilder) {
		this.personBuilder = personBuilder;
	}

	public void createPerson() {
		personBuilder.builderHead();
		personBuilder.builderBody();
		personBuilder.builderArmLeft();
		personBuilder.builderArmRight();
		personBuilder.builderLegLeft();
		personBuilder.builderLegRight();
	}

}
