import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Please enter the Fibonacci number: ");
        n = scanner.nextInt();
        
        System.out.println("The answer is: " + fib(n));

        System.out.println("Would you like to continue? Please enter yes or no");
        String YesNo = scanner.next();
        if (YesNo.equals("no")) break;
        }
        scanner.close();
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