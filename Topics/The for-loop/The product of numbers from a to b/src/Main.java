import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long result = 1;
        for (; a < b; a++) {
            result *= a;
        }
        System.out.println(result);
    }
}