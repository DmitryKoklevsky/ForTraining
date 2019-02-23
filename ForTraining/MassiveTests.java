package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MassiveTests {

	private Massive massive = new Massive(new int[] { 0, 0, 0, 0, 0 });
	private Massive massive2 = new Massive(new int[] { 10, 27, 3000, 5, 0 });
	private Massive massive3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void copyPartArrayTesPozitiv() {
		this.massive.copyPartArray(0, 3);
		assertEquals(3, massive.array.length);

	}

	@Test
	public void findMaxTest() {

		assertEquals(3000, this.massive2.findMaxElement());

	}

	@Test
	public void findMinTest() {

		assertEquals(0, this.massive2.findMinElement());

	}

	@Test
	public void SumTest() {

		assertEquals(3042, this.massive2.sumElements());

	}

	@Ignore
	@Test
	public void sumTestNotNull() {

		assertNotNull(this.massive3.sumElements());

	}

	@Test(expected = NullPointerException.class)
	public void sumTestNull() {

		assertNull(this.massive3.sumElements());

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void copyPartArrayTestExcept() {
		this.massive.copyPartArray(-1, 9);

	}

	@Test
	public void inputArrayTest() {
		this.massive.inputArray(1, 10);
		massive.toString();
		for (int i = 0; i < this.massive.array.length; i++) {

			assertTrue(this.massive.array[i] <= 10);
			assertTrue(this.massive.array[i] >= 1);
		}

	}

	@Ignore
	@Test
	public void sumPozitiveElementsTest() {

		assertTrue(this.massive2.sumElements() < 0);

	}
	
	@Test
	public void findMinElInBound() {
		this.massive.inputArray(1, 10);
		this.massive.findMinElement();
		massive.toString();
		assertTrue(this.massive.findMinElement() >= 1);

	}

}
