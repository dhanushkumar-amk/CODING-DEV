package MATHS;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int n = 20;
        printPrime(n);
    }


    static void printPrime(int n){
        for (int i =2; i <= n ; i++) {
            if (isPrime(n))
                System.out.println(i);
        }
    }
    


//    isPrime function
    static  boolean isPrime(int n){
        for (int i = 2; i * i<= n ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}