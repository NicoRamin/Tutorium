import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VectorTest {

	int[] vector1 = {5, 6, 7};
	int[] vector2 = {1, 2, 3};
	
	int[] vector3 = {12, 24};
	int[] vector4 = {37, 8};

	//sumVector
	@Test
	public void sumVectorTest() {
		int[] sumVector = {6, 8, 10};
		Vector v = new Vector();
		Assert.assertArrayEquals(v.sumVectors(vector1, vector2), sumVector);
	}
	
	public void sumVectorTest2() {
		int[] sumVector = {49, 32};
		Vector v = new Vector();
		Assert.assertArrayEquals(v.sumVectors(vector3, vector4), sumVector);
	}

	@Test
	public void Vectorproduct() {
		int[] productVector = {4, -8, 4};
		Vector v = new Vector();
		Assert.assertArrayEquals(v.vectorProduct(vector1, vector2 ), productVector);
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
		double length = Math.sqrt(14);
		Vector v = new Vector();
		v.vectorLength(vector2);
		Assert.assertEquals(v.vectorLength(vector2), length, 0);
	}
	
	@Test
	public void vectorLength2() {
		double length = Math.sqrt(720);
		Vector v = new Vector();
		v.vectorLength(vector3);
		Assert.assertEquals(v.vectorLength(vector3), length, 0);
	}
}
