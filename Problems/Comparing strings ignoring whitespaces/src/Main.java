// importing libraries
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in); // create object for reading data from keyboard
        String str1 = scanner.nextLine(); // getting data as line one
        String str2 = scanner.nextLine(); // getting data as line two

        str1 = str1.replaceAll(" ", ""); // r : replacing whitespace with empty placement
        str2 = str2.replaceAll(" ", ""); // r
        System.out.println(str1.equals(str2)); // checking equality using equals

        // Note ! compareTo method tell how much difference between characters according to ascii.

    }
}