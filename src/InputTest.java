
public class InputTest {
	private Student[] array;

	@Before
	public void init() {
		this.array = new Student[100];
	}

	@Ignore @Test
	public void test() {
		assertNotNull(this.array);
	}

	@Test
	public void testInput() {
		input input=new Input(array);
		int count=input.input();
//		assertEquals(2,count)
		assertEquals("정지강",this.array[0].getName())
	}
}
