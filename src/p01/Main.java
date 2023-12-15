package p01;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero(1, "みなと");
		System.out.println(h.toString());

		// toString()は、インスタンス（変数）名だけで自動的に呼び出される
		System.out.println(h);

		String word = h + "サンプルテキスト";
		System.out.println(word);

		String name = "みなと";

		Hero h2 = new Hero(1, "みなと");
//		Hero h2 = h; //同じ番地を見ているため等しいと表示される

		if (h.equals(h2)) {
			System.out.println("等しい");
		} else {
			System.out.println("等しくない");
		}
	}
}
