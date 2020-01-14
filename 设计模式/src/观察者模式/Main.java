package 观察者模式;

import java.beans.EventHandler;

//又叫发布订阅模式
public class Main {
	public static void main(String[] args) {
		ConcreteSubject s = new ConcreteSubject();
		s.attach(new ConcreteObserver("X", s));
		s.attach(new ConcreteObserver("Y", s));
		s.attach(new ConcreteObserver("Z", s));
		
		s.setSubjectState("ABC");
		s.sendMsg();
	}
}
