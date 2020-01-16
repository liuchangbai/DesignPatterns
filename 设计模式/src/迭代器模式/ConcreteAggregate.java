package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {

	private List<Object> items = new ArrayList<Object>();
	public int count;

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int getCount() {
		return items.size();
	}

	public List<Object> getItems() {
		return items;
	}

	public void setItems(List<Object> items) {
		this.items = items;
	}

	public void add(Object object) {
		items.add(object);
	}

}
