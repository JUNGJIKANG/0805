import java.util.Date;

public class Car {
	private String name, maker;
	private int price;
	private Date today;

	public Car(String name, String maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
		System.out.println("방금 객체가 생성되었습니다.");
	}
	{//Initalization Block, 객체를 메모리에 로딩할 때 딱 한번 실행된다.
//멤버변수 초기화
		System.out.println("Hello, World");
		this.today=new Date();
	}
	@Override
	public String toString() {
		return"오늘은"+this.today+"입니다.";
	}
}
