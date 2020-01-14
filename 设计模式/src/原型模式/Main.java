package 原型模式;

public class Main {
	public static void main(String[] args) {
		Resume a = new Resume("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1992-2000", "YY公司");
		a.display();

		Resume b = (Resume) a.clone();
		b.setWorkExperience("1998-2006", "yy企业");
		b.display();

		Resume c = (Resume) a.clone();
		c.setWorkExperience("2006-2019", "zz企业");
		c.display();
	}
}
