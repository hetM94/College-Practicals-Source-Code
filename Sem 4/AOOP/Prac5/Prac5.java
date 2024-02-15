import java.util.Scanner;

class Prac5 {
    static boolean isPrime(int n) {
        if (n == 1 || n == 0) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void printFirstNPrimes(int n) {
        int count = 0;
        for (int i = 2; count < n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        printFirstNPrimes(n);
    }
}
