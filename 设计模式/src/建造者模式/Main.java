package 建造者模式;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Main {
	public static void main(String[] args) {

		PersonThinBuilder personThinBuilder = new PersonThinBuilder();
		PersonDirector personDirector = new PersonDirector(personThinBuilder);

		personDirector.createPerson();

		PersonFatBuilder personFatBuilder = new PersonFatBuilder();
		PersonDirector personDirector2=new PersonDirector(personFatBuilder);
		
		personDirector2.createPerson();

	}
}
