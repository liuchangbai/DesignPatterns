package 状态模式;

public class Main {
	public static void main(String[] args) {
		Work work = new Work();

		work.setHour(9);
		work.writeProgram();

		work.setFinish(true);
		work.setHour(14);
		work.writeProgram();
	}
}
