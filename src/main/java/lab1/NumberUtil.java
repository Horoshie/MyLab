package lab1;

public class NumberUtil {
    public static boolean isEven(int number) {
        boolean res;
        int division_without_remainder=number%2;
        if (division_without_remainder==0) {
            res=true;
        }
        else {
            res=false;
        }
        return res;
    }
    public static boolean isPrime(int number) {
        int divider=0;
        boolean res;
        int division_without_remainder;
        for (int i=1; i<=number; i++) {
            division_without_remainder=number%i;
            if (division_without_remainder==0) {
                divider += 1;
            }
        }
        if (divider==2) {
            res=true;
        }
        else {
            res=false;
        }
        return res;
    }


}
