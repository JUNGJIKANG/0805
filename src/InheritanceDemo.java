//내가 부모에게 접근하면 상속이라고 한다.
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
	}
}

class TwoD {
	int x = 5, y = 10;

	public TwoD() {
		System.out.println("나는 TwoD");
	}

	void print() {
		System.out.printf("(x,y)+(%d,%d)\n,", this.x, this.y);
	}
}

class ThreeD extends TwoD {
	int z = 100;

	public ThreeD() {
		System.out.println("나는 ThreeD");
	}
}