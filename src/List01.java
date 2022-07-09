import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

	/*-- 要素の追加 --*/
		list1.add("りんご");
		list1.add("みかん");
		// 下でりんご、バナナ、みかんの順番になる
//		list1.add(1, "バナナ");
		// コレクションの要素より大きい位置を指定→実行時エラー
//		list1.add(5, "ドリアン");

	/*-- 要素の取得 --*/
		list1.get(0); // 取得するだけ、表示はしない

	/*-- 存在チェック --*/
		list1.contains("バナナ"); // trueが返る

		list1.size();
	}

}
