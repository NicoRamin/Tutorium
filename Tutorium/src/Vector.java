import java.util.Arrays;
import java.util.regex.*;

public class Vector {
	
	public static void main(String[] args) {

		int[] vector1 = {5, 6, 7};
		int[] vector2 = {1, 2, 5};
		//vectorProduct(vector1, vector2);
		
		System.out.println(Arrays.toString(sumVectors(vector1, vector2)));
	}
	
	public static boolean timeCheck(String time) {
		Pattern pattern = Pattern.compile("(([0-1]\\d)|(2[0-3])):[0-5]{2}");
		Matcher matcher = pattern.matcher(time);
		
		return matcher.matches();
	}
	
	public static boolean matrikelCheck(String matrikelnummer) {
		
			Pattern pattern = Pattern.compile("2[012][12]\\d{4}");
			Matcher matcher = pattern.matcher(matrikelnummer);
			
			return matcher.matches();
	}

	public static void skalar(int[] vector, int skalar) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = vector[i] * skalar;
		}
	}

	public static int[] sumVectors(int[] vector1, int[] vector2) {
		if (lengthCheck(vector1, vector2) == false) {
			System.out.println("Nicht die selbe Laenge!");
			return null;
		}

		int[] returnVector = new int [vector1.length];
		for (int i= 0; i < vector1.length; i++) {
			returnVector[i] = vector1[i] + vector2[i];
		}

		return returnVector;
	}
	
	public static void vectorProduct(int[] vector1, int[] vector2 ) {
		if (vector1.length == 2) {
			
			int vectorProdutTwoD = vectorProdutTwoD(vector1, vector2);
			System.out.println(vectorProdutTwoD);
		} else {
			String vectorProductThreeD = Arrays.toString(vectorProductThreeD(vector1, vector2)); 
			System.out.println(vectorProductThreeD);

		}

	}


	public static int vectorProdutTwoD(int[] vector1, int[] vector2) {
		return (vector1[0] * vector2[1] - vector2[0] * vector1[1]);
	}

	public static int[] vectorProductThreeD(int[] vector1, int[] vector2) {
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

	public static double vectorLength(int[] vector) {
		int sum = 0;
		for (int i = 0; i < vector.length; i++) {
			sum += Math.pow(vector[i], 2);
		}
		return Math.sqrt(sum);
	}

}
