import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SortTest {

	@Test
	public void testBubbleSort() {
		Student[] array = new Student[] { new Student(), new Student() };
		array[0].setName("정지강");
		array[0].setTot(360);
		array[1].setName("김서예");
		array[1].setTot(370);
		Sort sort = new Sort(array, array.length);
		sort.bubbleSort();
		sort.bubbleSort();
		assertEquals("정지강", array[1].getName());

	}

	@Ignore @Test
	public void testSlelctionSort() {
		fail("Not yet implemented");
	}
}