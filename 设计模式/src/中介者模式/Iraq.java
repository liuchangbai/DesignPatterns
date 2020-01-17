package 中介者模式;

public class Iraq extends Country {

	public Iraq(UnitedNations mediaor) {
		super(mediaor);
	}

	public void declare(String message) {
		mediaor.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("伊拉克获得对方信息:" + message);
	}

}
