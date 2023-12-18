package p01;

public class Hero {
	int id;
	String name;

	public Hero(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean isInstance() {
		return this instanceof Hero;
	}

	// 適切な文字列表現を返すtoStringメソッドとしてオーバーライド
	public String toString() {
		return "ID:" + this.id + " NAME:" + this.name;
	}

	// equalsメソッドをオーバーライド
	public boolean equals(Object obj) {
		// ①まずオブジェクトが同一なら無条件にtrueを返す
		if (this == obj) {
			return true;
		}
		// ②次に、objをHero型にキャストできない場合は無条件にfalseを返す
		if (!(obj instanceof Hero)) { // [!] → 論理否定演算子（論理反転）
			return false;
		}
//		Hero h = (Hero)obj; // Heroインスタンスにキャストする
		return this.id == ((Hero) obj).id;
	}
}
