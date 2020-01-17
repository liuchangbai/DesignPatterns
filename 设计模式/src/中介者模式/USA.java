package 中介者模式;

public class USA extends Country {

	public USA(UnitedNations mediaor) {
		super(mediaor);
	}

	public void declare(String message) {
		mediaor.declare(message, this);
	}

	public void getMessage(String message) {
		System.out.println("美国获得对方信息:" + message);
	}

}
