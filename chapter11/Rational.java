/**
 * Rational.java
 * @author Ben Durham
 * @version 20180203
 * Chapter 11, Exercise 5
 * A class written to express any possible rational number
 */

public class Rational {
	private int num;
	private int den;

	public Rational() {
		this.num = 0;
		this.den = 1;
	}

	public Rational(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public void negate() {
		this.num *= -1;
	}
	
	public void invert() {
		int temp = this.num;
		this.num = this.den;
		this.den = temp;
	}

	public void reduce() {
		int q = this.num;
		int p = this.den;
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		int gcd = p;
		this.num /= gcd;
		this.den /= gcd;
	}

	public double toDouble() {
		return (double) this.num / this.den;
	}

	public void printRational() {
		System.out.printf("%d/%d\n", this.num, this.den);
	}

	public Rational add(Rational addend) {
		this.reduce();
		addend.reduce();
		int nNum = this.num * addend.den + addend.num * this.den;
		int nDen = this.den * addend.den;
		Rational temp = new Rational(nNum, nDen);
		temp.reduce();
		return temp;
	}

	public String toString() {
		return String.format("%d/%d", this.num, this.den);
	}

	public static void main(String[] args) {
		// Testing Constructor
		Rational newFrac = new Rational();
		
		// Testing printRational()
		newFrac.num = 6;
		newFrac.printRational();
		
		// Testing negate()
		newFrac.negate();
		System.out.println(newFrac);
		
		// Testing invert()
		newFrac.invert();
		System.out.println(newFrac);

		// Testing toDouble()
		System.out.println(newFrac.toDouble());

		// Testing reduce()
		newFrac.num = 6;
		newFrac.den = 3;
		System.out.println(newFrac);
		newFrac.reduce();
		System.out.println(newFrac);

		// Testing add()
		newFrac.num = 2;
		newFrac.den = 1;
		Rational newFrac2 = new Rational(1, 2);
		System.out.println(newFrac.add(newFrac2));
	}
}
