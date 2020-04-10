package application;

import java.util.Locale;
import java.util.Scanner;

public class SemOrientacaoAoObjetoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
			double xA, xB, xC, yA, yB, yC;
			
			System.out.println("Enter de measures of triangle X: ");
			xA = scan.nextDouble();
			xB = scan.nextDouble();
			xC = scan.nextDouble();
			
			System.out.println("Enter de measures of triangle Y: ");
			yA = scan.nextDouble();
			yB = scan.nextDouble();
			yC = scan.nextDouble();
			
			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA)*(p - xB)*(p - xC));
			
			p = (yA + yB + yC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA)*(p - yB)*(p - yC));
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);
			
			if (areaX > areaY) {
				System.out.println("Large area X");
			} else {
				System.out.println("Large area Y");
			}
			
		scan.close();
	}

}
