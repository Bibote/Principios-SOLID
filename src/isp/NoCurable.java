package isp;

public class NoCurable implements Icure {

	@Override
	public void cure() {
		System.out.println("ERROR, can not be treated");
	}

}
