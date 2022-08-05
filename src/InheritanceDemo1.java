
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
//		System.out.println(m.salary);
//		System.out.println(e.name);
		System.out.println(e.salary); //상속이다. e(자식주소)가 m(부모주소)를 사용하기 때문에
	}
}

class Manager {// 부모 클래스
	int salary = 100000;
}

class Employee extends Manager { // 이 단계에서 상속관계를 맺는것이다, 자식 클래스
	String name = "정지강";
}
