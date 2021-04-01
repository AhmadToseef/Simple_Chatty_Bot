import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int value = scanner.nextInt();
        int first = value / 100;
        int second = (value / 10) % 10;
        int thired = value % 10;
        if (thired != 0) {
            System.out.println(Integer.parseInt(Integer.toString(thired)) + "" + second + "" + first);
        } else {
            System.out.println(second + "" + first);
        }
    }
}