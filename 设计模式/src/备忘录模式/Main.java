package 备忘录模式;

public class Main {
	public static void main(String[] args) {

		// 大战前
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();

		// 保存进度
		RoleStateCaretaker admin = new RoleStateCaretaker();
		admin.setMemento(lixiaoyao.saveState());

		// 大战boss 死了
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();

		// 恢复之前存档
		lixiaoyao.recoveryState(admin.getMemento());
		lixiaoyao.stateDisplay();

	}
}
