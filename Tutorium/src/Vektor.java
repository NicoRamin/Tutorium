import java.util.Arrays;

public class Vektor {
	public static void main(String[] args) {
	
		
		int[] vektor1 = {5, 6, 7, 8};
		int[] vektor2 = {1, 2, 3, 4};
		
		int [] Vektor3 = vektorprodukt(vektor1, vektor2);
		System.out.println(Arrays.toString(Vektor3));
	}
	
	public static void skalar(int [] vektor, int skalar) {
		for(int i = 0; i < vektor.length; i++) {
			vektor[i] = vektor[i] * skalar;
		}
	}
	
	public int [] sumVektors(int [] vektor1, int [] vektor2) {
		if(lengthCheck(vektor1, vektor2) == false) {
			System.out.println("Nicht die selbe Länge!");
			
		}

		int [] returnVektor = new int [vektor1.length];
		for(int i= 0; i < vektor1.length; i++) {
			returnVektor[i] = vektor1[i] + vektor2[i];
		}
		
		return returnVektor;
	}
	
	public static int [] vektorprodukt(int [] vektor1, int [] vektor2) {
		int [] returnVektor = new int [vektor1.length];
		returnVektor[0] = (vektor1[1] * vektor2[2]) - (vektor1[2] * vektor2[1]);
		returnVektor[1] = (vektor1[2] * vektor2[0]) - (vektor1[0] * vektor2[2]);
		returnVektor[2] = (vektor1[0] * vektor2[1]) - (vektor1[1] * vektor2[0]);

		return returnVektor;
	}
	
	public static boolean lengthCheck(int [] vektor1, int [] vektor2) {
		if(vektor1.length == vektor2.length) {
			return true;
		} else return false;
	}
}