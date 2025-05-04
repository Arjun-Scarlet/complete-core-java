package e_oopsConcepts.Object;

// BigInteger is a class which is present in java.math pakage
// BigInteger allows to work with numbers of virtually unlimited size (as long as memory allows)
// It provides various operations for arbitrarily large integers
import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        // Initialize BigInteger values
        BigInteger b1 = new BigInteger("12345678901234567890");
        BigInteger b2 = new BigInteger("98765432109876543210");

        // Arithmetic Operations
        System.out.println("Addition: " + b1.add(b2));
        System.out.println("Subtraction: " + b1.subtract(b2));
        System.out.println("Multiplication: " + b1.multiply(b2));
        System.out.println("Division: " + b2.divide(b1));
        System.out.println("Modulus: " + b2.mod(b1)+"\n");

        // Power
        System.out.println("Power: " + b1.pow(2)+"\n");

        // GCD
        System.out.println("GCD: " + b1.gcd(b2)+"\n");

        // Absolute value
        BigInteger negative = new BigInteger("-12345");
        System.out.println("Absolute: " + negative.abs()+"\n");

        // Comparison
        System.out.println("Comparison (b1 vs b2): " + b1.compareTo(b2));
        System.out.println("Equals: " + b1.equals(b2)+"\n");

        // Min and Max
        System.out.println("Min: " + b1.min(b2));
        System.out.println("Max: " + b1.max(b2)+"\n");

        // Bitwise Operations
        System.out.println("AND: " + b1.and(b2));
        System.out.println("OR: " + b1.or(b2));
        System.out.println("XOR: " + b1.xor(b2));
        System.out.println("NOT (b1): " + b1.not());
        System.out.println("Left Shift: " + b1.shiftLeft(2));
        System.out.println("Right Shift: " + b1.shiftRight(2)+"\n");

        // Prime Testing
        System.out.println("Is Probable Prime: " + b1.isProbablePrime(10)+"\n");

        // Conversion
        System.out.println("To String: " + b1.toString());
        System.out.println("To Binary String: " + b1.toString(2));
        System.out.println("To Long Value: " + b1.longValue()+"\n");

        // Random BigInteger
        BigInteger randomBigInt = new BigInteger(50, new java.util.Random());
        System.out.println("Random BigInteger: " + randomBigInt);
    }
}
