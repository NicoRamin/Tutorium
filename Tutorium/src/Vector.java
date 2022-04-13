import java.util.Arrays;
import java.util.regex.*;

public class Vector {
	
	public static void main(String[] args) {

		int[] vector1 = {5, 6, 7};
		int[] vector2 = {1, 2, 5};
		vectorProduct(vector1, vector2);
		
		//String encode = "H5e6r843r To04d5o8r46ov i4431s1t P2r5o14351fe3s35s8o3r fu15e43r M153a5t35h3e";
		//System.out.println(encrypt(encode));

		//String[] studenten = {"191672@hs-mannheim.de", "221731@stud.hs-mannheim.de"};
		//System.out.println( Arrays.toString( catchMatrikelnummer(studenten) ) );
		
		System.out.println(matrikel("2013362"));
	}
	
	public static boolean matrikel(String Matrikelnummer) {
		
			Pattern pattern = Pattern.compile("2[012][12]\\d{4}");
			Matcher matcher = pattern.matcher(Matrikelnummer);
			
			if(matcher.matches()) {
				return true;
			} else {
				return false;
			}
	}

	public static void skalar(int[] vector, int skalar) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = vector[i] * skalar;
		}
	}

	public int[] sumVectors(int[] vector1, int[] vector2) {
		if (lengthCheck(vector1, vector2) == false) {
			System.out.println("Nicht die selbe Laenge!");
			return new int[0];
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

	public static String encrypt(String encode){
		return encode.replaceAll("[0-9]", "");
	}

}
