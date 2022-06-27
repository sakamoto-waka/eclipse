package extend.phone;

public interface Phone {
	// 定数と抽象クラス
	final int MAX_NUMBER_DEGIT = 11;

	public void call(String number);

	default void powerOff() {
        System.out.println("電源を切ります。");
    }
}
