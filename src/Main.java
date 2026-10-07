import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String reversed = new StringBuilder(n).reverse().toString();

        System.out.println(reversed);
    }
}