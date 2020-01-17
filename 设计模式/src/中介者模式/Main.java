package 中介者模式;

public class Main {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncli UNSC = new UnitedNationsSecurityCouncli();

		USA usa = new USA(UNSC);
		Iraq iraq = new Iraq(UNSC);

		UNSC.setColleague1(usa);
		UNSC.setColleague2(iraq);

		usa.declare("不准研发核武器.");
		iraq.declare("滚犊子吧 美国.");

	}
}
