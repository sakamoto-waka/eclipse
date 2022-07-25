package practice;

public class DemoDemo {
	public static void main(String[] args) {
		int[] numbers = new int[20];
		for(int i = 0; i < 20; i++) {
			putsNumArray(i, numbers);
			result(i, numbers);
		}
	}

	public static void putsNumArray(int i, int[] numbers) {
		if(i == 0) {
			numbers[i] = 0;
		} else {
			numbers[i] = numbers[i - 1] + 5;
		}
	}

	public static void result(int i, int[] numbers) {
		if(numbers[i] % 2 != 0 && i < 11) {
			System.out.print(numbers[i] + ",");
		} else if(numbers[i] % 2 == 0 && i >= 11) {
			System.out.print(numbers[i] + (i == 18 ? "" : ","));
		}
	}
}
