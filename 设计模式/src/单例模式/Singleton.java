package 单例模式;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

	private static Singleton singleton;

	private static Lock lock = new ReentrantLock();

	private Singleton() {
	}

	public static Singleton getSingleton() {

		if (singleton == null) {
			try {
				lock.lock();
				if (singleton == null) {
					singleton = new Singleton();
				}
			} finally {
				lock.unlock();
			}
		}
		return singleton;
	}

	public static Singleton getSingleton2() {
		try {
			lock.lock();

			if (singleton == null) {
				singleton = new Singleton();
			}
		} finally {
			lock.unlock();
		}
		return singleton;
	}

	public static Singleton getSingleton1() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}
