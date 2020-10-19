package problem18_10;

import java.util.Scanner;

public class Main_18_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//	int n = scan.nextInt();
	//	int d = scan.nextInt();
		Fraction f1 = new Fraction(1,2);
	//	int n1 = scan.nextInt();
	//	int d2 = scan.nextInt();
		Fraction f2 = new Fraction(3,4); 
		scan.close();
		
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator()
		+ " + " + f2.getNumerator() + "/" + f2.getDenominator() + " = " + f1.add(f2));
		
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator()
		+ " - " + f2.getNumerator() + "/" + f2.getDenominator() + " = " + f1.substract(f2));
	
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator()
		+ " * " + f2.getNumerator() + "/" + f2.getDenominator() + " = " + f1.multiply(f2));
		
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator()
		+ " : " + f2.getNumerator() + "/" + f2.getDenominator() + " = " + f1.divide(f2));

		System.out.print(f1 + " = "); f1.simplify();
		System.out.print(f2 + " = "); f2.simplify();
	}

}
