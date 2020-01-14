package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();

	// 增加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}

	// 删除观察者
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void sendMsg() {
		for (Observer o : observers) {
			o.update();
		}
	}

}
