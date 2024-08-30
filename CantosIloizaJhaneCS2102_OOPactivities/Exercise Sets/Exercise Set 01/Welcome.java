import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to CS 211: Object-Oriented Programming!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String message = "This course will be fun, ".concat(name).concat("!");
        System.out.println(message);
        scanner.close();
    }
}
