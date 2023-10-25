import java.util.Scanner;

public class J03004_TongPhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numeratorP = scanner.nextLong();
        long denominatorP = scanner.nextLong();
        long numeratorQ = scanner.nextLong();
        long denominatorQ = scanner.nextLong();
        Fraction p = new Fraction(numeratorP, denominatorP);
        Fraction q = new Fraction(numeratorQ, denominatorQ);
        Fraction sum = p.add(q);
        Fraction simplifiedSum = sum.simplify();
        System.out.println(simplifiedSum);
    }
}

class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        long commonDenominator = this.denominator * other.denominator;
        long sumNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        return new Fraction(sumNumerator, commonDenominator);
    }

    public Fraction simplify() {
        long gcd = calculateGCD(numerator, denominator);
        long simplifiedNumerator = numerator / gcd;
        long simplifiedDenominator = denominator / gcd;
        return new Fraction(simplifiedNumerator, simplifiedDenominator);
    }

    private long calculateGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
}