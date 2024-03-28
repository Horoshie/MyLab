package lab1;

public class NumberUtil {
    public static boolean isEven(int number) {
        boolean res;
        int num=number%2;
        if (num==0) {
            res=true;
        }
        else {
            res=false;
        }
        return res;
    }
    public static boolean isPrime(int number) {
        int Chislo=0;
        boolean res;
        int num;
        for (int i=1; i<=number; i++) {
            num=number%i;
            if (num==0) {
                Chislo += 1;
            }
        }
        if (Chislo==2) {
            res=true;
        }
        else {
            res=false;
        }
        return res;
    }


}
