package 抽象工厂模式;

public class Main {
	public static void main(String[] args) throws Exception {
		User user = new User();
		Department department = new Department();

		IUser iuser = DataAccess.createUser();
		iuser.insert(user);
		iuser.getUser(1);
		IDepartment iDepartment = DataAccess.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(1);

//		IFactory factory = new AccessFactory();
//		IUser iUser = factory.createUser();
//		iUser.insert(user);
//		iUser.getUser(1);
//
//		IFactory factory2 = new SQLServerFactory();
//		IDepartment iDepartment = factory2.createDepartment();
//		iDepartment.insert(department);
//		iDepartment.getDepartment(1);

	}
}
