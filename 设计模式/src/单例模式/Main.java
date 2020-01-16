package 单例模式;

public class Main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleton();
		Singleton singleton1 = Singleton.getSingleton();
		
		if(singleton==singleton1) {
			System.out.println("单例成功");
		}
	}
}
