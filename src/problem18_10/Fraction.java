package problem18_10;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	public Fraction(int numeratorValue , int denominatorValue)
	{
		if(denominatorValue != 0)
		{
			denominator = denominatorValue;
		}
		else
		{
			denominator = 1;
			//System.out.println("Please, input denominator other than 0");
		}
		
		numerator = numeratorValue;
	}
	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}
	public Fraction(int numeratorValue)
	{
		numerator = numeratorValue;
		denominator = 1;
	}
	public String toString()
	{
		String result = "" + numerator + "/";
		result+= denominator;
		return result;
	}
	public Fraction add(Fraction f)
	{
		int denominatorValue;
		if(denominator != f.denominator)
		{
			denominatorValue = denominator * f.denominator;
			numerator *= f.denominator;
			f.numerator *= denominator;
		}
		else denominatorValue = denominator; 
		int numeratorValue = numerator + f.numerator;
		
		return new Fraction(numeratorValue,denominatorValue);
	}
	public Fraction substract(Fraction f)
	{
		int denominatorValue;
		if(denominator != f.denominator)
		{
			denominatorValue = denominator * f.denominator;
			numerator *= f.denominator;
			f.numerator *= denominator;
		}
		else denominatorValue = denominator; 
		
		int numeratorValue = numerator - f.numerator;
		if(numeratorValue < 0) numeratorValue *= -1;
		
		return new Fraction(numeratorValue,denominatorValue);
	}
	public Fraction multiply(Fraction f) 
	{
		int denominatorValue = denominator * f.denominator;
		int numeratorValue = numerator * f.numerator; 
		
		return new Fraction(numeratorValue,denominatorValue);
	}
	public Fraction divide(Fraction f) 
	{
		int denominatorValue = denominator * f.numerator;
		int numeratorValue = numerator * f.denominator; 
		
		return new Fraction(numeratorValue,denominatorValue);
	}
	public void simplify()
	{
		int a = numerator;
		int b = denominator;
		if(b > a) 
		{
			int temp = a;
			a = b;
			b = temp;
		}//a is always bigger
		int nod = b;
		while(true)
		{
			if(a%nod == 0 && b%nod == 0) break;
			nod--;
		}
		int numeratorValue = numerator / nod;
		int denominatorValue = denominator / nod;
	
		System.out.println(numeratorValue + "/" + denominatorValue); 
	}
}
