import java.util.Scanner;
public class Tempconvert {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        Double C = input.nextDouble();
        Double F = (C * 9/5) + 32;
        System.out.printf("%.2f Celsius is %.2f Farenheit%n", C, F);
        input.close();
    }
}