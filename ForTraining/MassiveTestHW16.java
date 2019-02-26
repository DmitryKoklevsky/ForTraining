package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MassiveTest {

	private Massive massive = new Massive(new int[] { 10, 2, 3, 4 }, new double[] { 1.1, 2.2, 3.3, 4.4 });
	private Massive massive2 = new Massive(new int[] { 10, 3, 3, 4 });
	private Massive massive3 = new Massive(new int[] { 0, 0, 0 });
	private Massive massive4 = new Massive(null);

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

	// 1
	@Test
	public void sqrtLengthArrayTest() {
		Assert.assertEquals(2.0, massive.sqrtLengthArray());
	}

	// 2
	@Test
	public void sqrtLengthArrayNegativeTest() {
		Assert.assertNotEquals(-2.0, massive.sqrtLengthArray());
	}

	// 3
	@Test
	public void getMinLengthArrayTest() {
		Assert.assertEquals(3, massive.getMinLengthArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 3, 4 }), 0);
	}

	// 4
	@Test
	public void getMinLengthArrayNegativeTest() {
		Assert.assertNotEquals(5, massive.getMinLengthArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 3, 4 }), 0);
	}

	// 5
	@Test
	public void sortElementTest() {
		massive.sortElement();
		int[] ExpectedOrderArray = { 2, 3, 4, 10 };
		Assert.assertEquals(ExpectedOrderArray, massive.array);
	}

	// 6
	@Test
	public void sortElementNegativeTest() {
		massive.sortElement();
		int[] initialOrderArray = { 10, 2, 3, 4 };
		Assert.assertNotEquals(initialOrderArray, massive.array);
	}

	// 7
	@Test
	public void SumElementTest() {
		int expectedSumResult = 20; // sum all elements array {10,3,3,4}
		Assert.assertEquals(expectedSumResult, massive2.sumElements());

	}

	// 8
	@Test
	public void SumElementNegativeTest() {
		Assert.assertNotEquals(0, massive.sumElements());
	}

	// 9
	@Test
	public void findMinElementTest() {
		int expectedMinResult = 2; // for array {10,2,3,4}
		Assert.assertEquals(2, massive.findMinElement());
	}

	// 10
	@Test
	public void findMinElementNegativeTest() {
		int notExpectedMinResult = 100; //// for array {10,2,3,4}
		Assert.assertNotEquals(notExpectedMinResult, massive.findMinElement());
	}

	// 11
	@Test
	public void findMaxElementTest() {
		int expectedMinResult = 10; // for array {10,2,3,4}
		Assert.assertEquals(expectedMinResult, massive.findMaxElement());
	}

	// 12
	@Test
	public void findMaxElementNegativeTest() {
		int notExpectedMinResult = 100; //// for array {10,2,3,4}
		Assert.assertNotEquals(notExpectedMinResult, massive.findMaxElement());
	}

	// 13
	@Test
	public void copyPartArrayTest() {
		int[] expectedCopyArray = { 10, 3, 3 }; //// for array {10,3,3,4}
		Assert.assertEquals(expectedCopyArray, massive2.copyPartArray(0, 3));
	}

	// 14
	@Test
	public void copyPartArrayNegativeTest() {
		int[] notExpectedCopyArray = { 0, 0, 0 }; //// for array {10,3,3,4}
		Assert.assertNotEquals(notExpectedCopyArray, massive2.copyPartArray(0, 3));
	}

	// 15
	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void copyPartArrayTestExceptionArrayIndex() {
		massive2.copyPartArray(21, 22);
	}

	// 16
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void copyPartArrayTestExceptionIllegalArgument() {
		massive2.copyPartArray(21, 4);
	}

	// 17
	@Test
	public void inputArrayTest() {

		Assert.assertNotNull(massive2.inputArray(1, 100));
	}

	// 18
	@Test
	public void inputArrayTestNotEqual() {
		int[] initialArray = { 0, 0, 0 };
		Assert.assertNotEquals(initialArray, massive3.inputArray(1, 100));
	}

	// 19
	@Test
	public void shuffleArrayTestForNull() {

		Assert.assertNotNull(massive.shuffleArray());
	}

	// 20
	@Test(expectedExceptions = NullPointerException.class)
	public void shuffleArrayTestExpNullPointer() {
		massive2.shuffleArray();
	}

	// 21
	@Test()
	public void concatArraysTest() {
		double[] expectedConcatArray = { 2.1, 2.2, 2.3, 3.1, 3.2, 3.3 }; // concat two massives {2.1, 2.2, 2.3} and
																			// {3.1,3.2,3.3}
		Assert.assertEquals(expectedConcatArray,
				massive.concatArrays(new double[] { 2.1, 2.2, 2.3 }, new double[] { 3.1, 3.2, 3.3 }));
	}

	// 22
	@Test()
	public void concatArraysNegativeTest() {
		double[] notExpectedConcatArray = { 0, 0, 0, 0, 0, 0 };
		Assert.assertNotEquals(notExpectedConcatArray,
				massive.concatArrays(new double[] { 2.1, 2.2, 2.3 }, new double[] { 3.1, 3.2, 3.3 }));
	}

	// 23
	@Test(expectedExceptions = NullPointerException.class)
	public void concatArraysTestNullPointerSecondArgument() {
	massive.concatArrays(new double[] { 2.1, 2.2, 2.3 }, null);
	}
	// 24
	@Test(expectedExceptions = NullPointerException.class)
	public void sortTestNullPointer() {
		massive4.sortElement();
	}
	
	// 25
	@Test(expectedExceptions = NullPointerException.class)
	public void concatArraysTestNullPointerForFirstArgument() {
		 massive.concatArrays(null, new double[] {1.2,1.2,1.3});
	}
	
}
