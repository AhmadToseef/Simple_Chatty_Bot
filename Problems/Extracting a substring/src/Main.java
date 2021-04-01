// implemeting liberaries
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        if (value1 >= 0 && value2 <= str.length()) {
            System.out.println(str.substring(value1, value2 + 1));
        }

    }
}