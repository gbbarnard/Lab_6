public class Fibonacci {
    public static void main(String args[]){
        int n;

        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                System.out.println(fib(n));
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}