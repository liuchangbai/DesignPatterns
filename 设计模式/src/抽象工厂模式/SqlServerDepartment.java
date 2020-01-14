package 抽象工厂模式;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SQL Server中给Department表增加一条记录!");

	}

	@Override
	public User getDepartment(int id) {
		System.out.println("在SQL Server中根据ID得到Department表一条记录!");
		return null;
	}

}
