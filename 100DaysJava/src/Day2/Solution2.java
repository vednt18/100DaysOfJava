package Day2;
import java.io.*;
import java.math.*;

/**
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example,
 * the first six prime numbers are 2,3 5, 7, 11, 13, and .
 * Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether
 * it's prime or not prime.
 */



public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger biN = new BigInteger(n);

        if (biN.isProbablePrime(1)) System.out.println("prime");
        else System.out.println("not prime");
        bufferedReader.close();
    }
}
