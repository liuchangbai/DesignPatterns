package 迭代器模式;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;

	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		current++;
		if (current < aggregate.getCount()) {
			ret = aggregate.getItems().get(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate.getItems().get(current);
	}

}
