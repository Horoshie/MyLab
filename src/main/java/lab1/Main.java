package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=8;
        while (number%2!=0 | number%2!=1) {
            System.out.println("Mistake! Enter a new number");
            //ввод числа
        }
        isPrime(number);
        isEven(number);
    }

}
