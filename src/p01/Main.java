package p01;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero(1, "みなと");
		System.out.println(h.toString());
		
		// toString()は、インスタンス（変数）名だけで自動的に呼び出される
		System.out.println(h);
		
		String word = h + "サンプルテキスト";
		System.out.println(word);
	}
}
