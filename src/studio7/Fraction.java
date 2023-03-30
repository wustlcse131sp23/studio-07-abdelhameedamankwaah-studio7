package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String multiply() {
		int addNumerator = this.numerator * numerator;
		int addDenominator = this.denominator * denominator;
		return addNumerator + "/" + addDenominator;
	}
	
	public String reciprocal()
	{
		int newNumerator = -1 * (this.denominator);
		int newDenominator = this.numerator;
		
		return newNumerator + "/" + newDenominator;
	}
	
	public static void main(String[] args) {
		Fraction firstFraction = new Fraction(3, 4);
		Fraction secondFraction = new Fraction(1, 2);
	}

		
	
}
