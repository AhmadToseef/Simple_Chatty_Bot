import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int divide = scanner.nextInt();

        if (length * width >= divide && (divide % length == 0 || divide % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}