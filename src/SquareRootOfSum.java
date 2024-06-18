import java.util.Scanner;
public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int sum;
        double squareRoot;

        System.out.println("Insert the first number");
        num1 = scan.nextInt();
        System.out.println("Insert the second number");
        num2 = scan.nextInt();

        sum = num1 + num2;
        squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
