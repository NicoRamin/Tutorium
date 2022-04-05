import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTest {

	int[] vector1 = {5, 6, 7};
	int[] vector2 = {1, 2, 3};

	@Test
	public void sumVectorTest() {
		int[] sumVector = {6, 8, 10};
		Vector v = new Vector();
		Assert.assertArrayEquals(v.sumVectors(vector1, vector2), sumVector);
	}

	@Test
	public void Vectorproduct() {
		int[] productVector = {4, -8, 0};
		Vector v = new Vector();
		Assert.assertArrayEquals(v.vectorproduct(vector1, vector2 ), productVector);
	}

	@Test
	public void skalarProduct() {
		int[] skalarVector = {15, 18, 21};
		Vector v = new Vector();
		v.skalar(vector1, 3);
		Assert.assertArrayEquals(vector1, skalarVector);
		}

	@Test
	public void vectorLength() {
		int length = Math.sqrt(14);
		Vector v = new Vector();
		v.vectorLength(vector2);
		Assert.assertEquals(v.vectorLength(vector2), length);
		}


}
