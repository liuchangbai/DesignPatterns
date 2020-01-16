package 组合模式;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
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
		System.out.println(name + " 员工培训管理!");

	}

}
