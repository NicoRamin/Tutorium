// Musterlösung Pflichtübung 3
import java.util.Arrays;
import java.util.regex.*;

public class Vector {
	public static void main(String[] args) {
	        int[] vector1 = {5, 6, 7};
	        int[] vector2 = {1, 2, 5};
	        vectorProduct(vector1, vector2);
	    }

	//Methode berechnet das Produkt 2 gleichdimensionaler Vektoren. Ruft weiteres Unterprogramm für 2D oder 3D Vektor auf.
	public static void vectorProduct(int[] vector1, int[] vector2) {
		if (vector1.length == 2) {
			 // rufe 2D-Vektorprodukt Methode auf
			int vectorProdutTwoD = vectorProdutTwoD(vector1, vector2);
			System.out.println(vectorProdutTwoD);
		} else {
			 // rufe 3D-Vektorprodukt Methode auf
			int[] vectorProductThreeD = vectorProductThreeD(vector1, vector2);
			System.out.println(Arrays.toString(vectorProductThreeD));
		}
	}

	// Verechnet das Produkt 2D-Vektoren
	public static int vectorProdutTwoD(int[] vector1, int[] vector2) {
		 //return Zahl
        return (vector1[0] * vector2[1] - vector2[0] * vector1[1]);
    }

	// Verechnet das Produkt 2D-Vektoren
    public static int[] vectorProductThreeD(int[] vector1, int[] vector2) {
        int[] returnVector = new int[vector1.length];
		// gehe jede x,y,z durch und berechne
        returnVector[0] = (vector1[1] * vector2[2]) - (vector1[2] * vector2[1]);
        returnVector[1] = (vector1[2] * vector2[0]) - (vector1[0] * vector2[2]);
        returnVector[2] = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);

		// return int Array
        return returnVector; 
    }

	// Berechnet dem Vektor mit einem skalar. Kein Rückgabewert.
	public static void skalar(int[] vector, int skalar) {
		//erhöhe jeden x,y,z um den skalar
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i] * skalar;
        }
    }

	// Berechnet die Summe nur wenn beide Vektoren die selbe Dimension haben. Rückgabewert ist ein neuer Vektor in Form von Integer-Array.
	public int[] sumVectors(int[] vector1, int[] vector2) {
		// Prüft ob unterscheidliche Dimension
        if (lengthCheck(vector1, vector2) == false) {
            System.out.println("Nicht die selbe Laenge!");
            // Beende Methode
			return null; 
        }

        int[] returnVector = new int[vector1.length];
		// Addiere beide Vektoren an der Stelle x,y,z
        for (int i = 0; i < vector1.length; i++) {
            returnVector[i] = vector1[i] + vector2[i];
        }
        return returnVector;
    }

	// Prüft die Länge/Dimension zweier Vektoren
	public static boolean lengthCheck(int[] vector1, int[] vector2) {
        if (vector1.length == vector2.length) {
            return true;
        } else return false;
    }

	// Berechne die Länge eines Vektors. Mathemathische Formel
	public static double vectorLength(int[] vector) {
        int sum = 0;
		//Potenziere x,y,z mit 2 und addiere alles
        for (int i = 0; i < vector.length; i++) {
            sum += Math.pow(vector[i], 2);
        }
		// Gebe die Qurzel der Summe zurück
        return Math.sqrt(sum);
    }

    // Checkt ob eine Martrikelnummer valide nach folgender Richtlinie ist
	public static boolean matrikelCheck(String matrikelnummer) {
		// Nach dieser Richtlinie matchen wir gleich
		Pattern pattern = Pattern.compile("2[012][12]\\d{4}");
		Matcher matcher = pattern.matcher(matrikelnummer);
		
		// return true oder false
		return matcher.matches();
	}
    
	// Checkt ob eine Uhrzeit valide nach folgender Richtlinie ist
	public static boolean timeCheck(String time) {
		// Nach dieser Richtlinie matchen wir gleich
		Pattern pattern = Pattern.compile("(([0-1]\\d)|(2[0-3])):[0-5]{2}");
		Matcher matcher = pattern.matcher(time);
		
		// return true oder false
		return matcher.matches();
	}
    
}