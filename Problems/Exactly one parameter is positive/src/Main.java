import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println((num > 0 && num1 <= 0 && num2 <= 0) || (num1 > 0 && num <= 0 && num2 <= 0) || (num2 > 0 && num1 <= 0 && num <= 0));
    }
}