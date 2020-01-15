package 备忘录模式;

public class GameRole {
	private int vit;
	private int atk;
	private int def;

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void stateDisplay() {
		System.out.println("当前角色状态:");
		System.out.println("体力:" + this.vit);
		System.out.println("攻击力:" + this.atk);
		System.out.println("防御力:" + this.def);
		System.out.println("");
	}

	public void getInitState() {
		this.atk = 100;
		this.def = 100;
		this.vit = 100;
	}

	public void fight() {
		this.atk = 0;
		this.def = 0;
		this.vit = 0;
	}

	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def);
	}

	public void recoveryState(RoleStateMemento memento) {
		this.atk = memento.getAtk();
		this.def = memento.getDef();
		this.vit = memento.getVit();
	}
}
