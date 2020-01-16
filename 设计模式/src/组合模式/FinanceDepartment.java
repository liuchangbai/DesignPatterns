package 组合模式;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		String str = "";
		for (int i = 0; i < depth; i++) {
			str += "-";
		}
		System.out.println(str + name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name + " 公司财务收支管理!");
	}

}
