package p01;
public class Hero {
	int id;
	String name;
	
	public Hero(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "ID:" + this.id + " NAME:" + this.name;
	}
}
