/* 상속시 주의할 점
 * 2. private은 상속되지 않는다. 부모클래스와 자식클래스로 엄연히 다른 클래스이기 때문이다.
 */
public class InheritanceDemo3 {
private String name;
public Birds() {
	name="나는 새다.";
}
public Birds(String name) {
	this.name=name;
}
}
