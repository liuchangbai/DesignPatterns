package 抽象工厂模式;

public class DataAccess {
	private static final String assemblyName = "抽象工厂模式";
	private static final String db = "SqlServer";

	public static IUser createUser() throws Exception {

		Class c1 = Class.forName(assemblyName + "." + db + "User");

		IUser user = (IUser) c1.newInstance();
		return user;
	}

	public static IDepartment createDepartment() throws Exception {

		Class c1 = Class.forName(assemblyName + "." + db + "Department");

		IDepartment department = (IDepartment) c1.newInstance();
		return department;
	}
}
