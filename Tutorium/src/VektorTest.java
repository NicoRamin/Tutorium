import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VektorTest {

	int[] vektor1 = {5, 6, 7, 8};
	int[] vektor2 = {1, 2, 3, 4};
	
	@Test
	public void sumVektorTest() {
		int[] sumVektor = {6, 8, 10, 12};
		Vektor v = new Vektor();
		Assert.assertArrayEquals(v.sumVektors(vektor1, vektor2 ), sumVektor);
	}
	
	@Test
	public void Vektorprodukt() {
		int[] produktVektor = {4, -8, 4, 0};
		Vektor v = new Vektor();
		Assert.assertArrayEquals(v.vektorprodukt(vektor1, vektor2 ), produktVektor);
	}

	@Test
	public void skalarProdukt() {
		int[] skalarVektor = {15, 18, 21, 24};
		Vektor v = new Vektor();
		v.skalar(vektor1, 3);
		
		Assert.assertArrayEquals(vektor1, skalarVektor);
		}
}
