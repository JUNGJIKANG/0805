
public class Lion extends Mammal {
	private int age;

	public Lion(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public String toStirng(){
		return "이름은" + getName() + "나이는" + this.age;
	}
}
//내가 나의 부모메소드를 부를 땐 super메소드를 활용