package DSAPractice;
import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
        System.out.println(calFactorial(100));  // Factorial of 100
        System.out.println(calFactorial(50));
    }

    public static BigInteger calFactorial(int num) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));  // Multiply result by current number
        }
        return res;
    }
}
