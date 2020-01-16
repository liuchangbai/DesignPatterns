package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {

	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);

	}

	@Override
	public void remove(Company c) {
		children.remove(c);

	}

	@Override
	public void display(int depth) {

		String str = "";
		for (int i = 0; i < depth; i++) {
			str += "-";
		}
		System.out.println(str + name);
		for (Company company : children) {
			company.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		for (Company company : children) {
			company.lineOfDuty();
		}

	}

}
