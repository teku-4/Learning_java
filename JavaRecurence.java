
public class JavaRecurence {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n == 0) {
            return 1;
        }
        // When n > 0
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int result = calculateFactorial(7);
        System.out.println(result);
    }
}
