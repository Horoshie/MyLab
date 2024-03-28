package lab1;

import java.util.InputMismatchException;
import java.util.Scanner;
import static lab1.NumberUtil.isEven;
import static lab1.NumberUtil.isPrime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean finish;
        finish = isEven(number);
        if (finish == true) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        boolean finishh;
        finishh = isPrime(number);
        if (finishh == true) {
            System.out.println("Number is simple");
        } else {
            System.out.println("Number is composite");
        }
    }

}
