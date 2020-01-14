package 原型模式;

public class Resume implements Cloneable {

	private String name;
	private String sex;
	private String age;

	private WorkExperience workExperience;

	public Resume(String name) {
		this.name = name;
		workExperience = new WorkExperience();
	}

	public Resume(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExperience(String workDate, String company) {
		workExperience.setWorkDate(workDate);
		workExperience.setCompany(company);
	}

	public void display() {
		System.out.println(name + sex + age);
		System.out.println(workExperience.getWorkDate() + workExperience.getCompany());
	}

	public Object clone() {

		Resume obj = new Resume(workExperience);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
}
