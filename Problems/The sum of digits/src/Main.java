import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        System.out.println((value % 10) + ((value / 10) % 10) + ((value / 100) % 10));
    }
}