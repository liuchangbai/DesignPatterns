package 抽象工厂模式;

public interface IFactory {
	IUser createUser();

	IDepartment createDepartment();
}
