package lab1;

public class NumberUtil {
    public static boolean isEven(int number) {
        if (number%2==0) {
            System.out.println("Number is even");
        }
        else if (number%2==1) {
            System.out.println("Number is odd");
        }
    }
    public static boolean isPrime(int number) {
        int Chislo=0;
        for (int i=1; i<=number; i++) {
            if (number%2==0) {
                Chislo+=1;
            }
        }
        if (Chislo==2) {
            System.out.println("Number is default");
        }
        else {
            System.out.println("Number is composite");
        }
    }


}
