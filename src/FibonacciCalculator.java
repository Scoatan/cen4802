public class FibonacciCalculator {

        /**
     * Calculates the nth term in the Fibonacci sequence recursively.
     *
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci value at position n
     */
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int number = 10;

        int result = fibonacci(number);

        System.out.println("The 10th term of the Fibonacci sequence is " + result + ".");
    }
}