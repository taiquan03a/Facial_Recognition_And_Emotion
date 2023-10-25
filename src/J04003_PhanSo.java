import java.util.Scanner;

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numerator = scanner.nextLong();
        long denominator = scanner.nextLong();
        scanner.close();

        Fraction fraction = new Fraction(numerator, denominator);
        Fraction simplifiedFraction = fraction.simplify();

        System.out.println(simplifiedFraction);
    }
}

class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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