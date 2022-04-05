import java.util.Arrays;

public class Vector {
	public static void main(String[] args) {

		int[] vector1 = {5, 6, 7};
		int[] vector2 = {1, 2, 3};
		int[] vector3 = vectorProdukt(vector1, vector2);
		System.out.println(Arrays.toString(vector3));
	}

	public static void skalar(int[] vector, int skalar) {
		for(int i = 0; i < vector.length; i++) {
			vector[i] = vector[i] * skalar;
		}
	}

	public int[] sumVectors(int[] vector1, int[] vector2) {
		if(lengthCheck(vector1, vector2) == false) {
			System.out.println("Nicht die selbe Laenge!");
			return new int[0];
		}

		int[] returnVector = new int [vector1.length];
		for(int i= 0; i < vector1.length; i++) {
			returnVector[i] = vector1[i] + vector2[i];
		}

		return returnVector;
	}

	public static int[] vectorProdukt(int[] vector1, int[] vector2) {
		int[] returnVector = new int [vector1.length];
		returnVector[0] = (vector1[1] * vector2[2]) - (vector1[2] * vector2[1]);
		returnVector[1] = (vector1[2] * vector2[0]) - (vector1[0] * vector2[2]);
		returnVector[2] = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);

		return returnVector;
	}

	public static boolean lengthCheck(int[] vector1, int[] vector2) {
		if(vector1.length == vector2.length) {
			return true;
		} else return false;
	}

	public static double vectorLength(int[] vector1) {
		return Math.sqrt( Math.pow(vector1[0], 2) + Math.pow(vector1[1], 2) + Math.pow(vector1[2], 2) );
	}
}
