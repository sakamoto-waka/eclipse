package practice;

public interface Flying {
	// 抽象メソッド
	void fly();
	
	default void powerOff() {
		System.out.println("飛んでる場合は落下します。");
	}
}
