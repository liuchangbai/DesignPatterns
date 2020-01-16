package 迭代器模式;

public class Main {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();

		a.add("大鸟");
		a.add("小菜");
		a.add("行李");
		a.add("老外");
		a.add("公交内部人员");
		a.add("小偷");

		Iterator i = new ConcreteIterator(a);

		Object first = i.first();
		System.out.println(first);

		while (!i.isDone()) {
			System.out.println(i.currentItem() + "请买车票");
			i.next();
		}
	}
}
