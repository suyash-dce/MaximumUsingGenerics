import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestMaximumTest {

	TestMaximumMain testObj;

	@Before
	public void init() {
		testObj=new TestMaximumMain();
	}

	//Integer Test

	// TC 1.1
	@Test
	public void maxNumberAtFirstPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 3, 2, 1 };
		//System.out.println(testObj.findMaximum(Arrays.stream(num_arr)).getClass().getName());
		assertEquals(3, (int)testObj.findMaximum(Arrays.stream(num_arr)));
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}

	// TC 1.2
	@Test
	public void maxNumberAtSecondPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 1, 3, 2 };
		assertEquals(3, (int)testObj.findMaximum(Arrays.stream(num_arr)));
=======
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}

	// TC 1.3
	@Test
	public void maxNumberAtThirdPos_ShouldReturnSame() {
		Integer num_arr[] = new Integer[] { 1, 2, 3 };
		assertEquals(3, (int)testObj.findMaximum(Arrays.stream(num_arr)));
	}

	//Float Test

=======
		assertEquals(3, testObj.maxNumber(Arrays.stream(num_arr)));
	}


	//Float Test
	
	// TC 1.1
	@Test
	public void maxFloatAtFirstPos_ShouldReturnSame() {
		Float fl_arr[] = new Float[] { 3f, 2f, 1f };
		assertEquals(3f, (float)testObj.findMaximum(Arrays.stream(fl_arr)),0);
=======
		assertEquals(3f, testObj.maxFloat(Arrays.stream(fl_arr)),0);
	}

	// TC 1.2
	@Test
	public void maxFloatAtSecondPos_ShouldReturnSame() {
		Float fl_arr[] = new Float[] { 1f, 3f, 2f };
		assertEquals(3f, (float)testObj.findMaximum(Arrays.stream(fl_arr)),0);
=======
		assertEquals(3f, testObj.maxFloat(Arrays.stream(fl_arr)),0);
	}

	// TC 1.3
	@Test
	public void maxFloatAtThirdPos_ShouldReturnSame() {
		Float fl_arr[] = new Float[] { 1f, 2f, 3f };
		assertEquals(3f, (float)testObj.findMaximum(Arrays.stream(fl_arr)),0);
	}

	//String Test

	// TC 1.1
	@Test
	public void maxStringAtFirstPos_ShouldReturnSame() {
		String str_arr[] = new String[] { "Pineapple","Apple","Kheera" };
		assertEquals("Pineapple", testObj.findMaximum(Arrays.stream(str_arr)));
	}

	// TC 1.2
	@Test
	public void maxStringAtSecondPos_ShouldReturnSame() {
		String str_arr[] = new String[] { "Apple","Pineapple","Kheera" };
		assertEquals("Pineapple", testObj.findMaximum(Arrays.stream(str_arr)));
	}

	// TC 1.3
	@Test
	public void maxStringAtThirdPos_ShouldReturnSame() {
		String str_arr[] = new String[] { "Apple","Kheera","Pineapple" };
		assertEquals("Pineapple", testObj.findMaximum(Arrays.stream(str_arr)));
	}
=======
		assertEquals(3f, testObj.maxFloat(Arrays.stream(fl_arr)),0);
	}
=======

}
