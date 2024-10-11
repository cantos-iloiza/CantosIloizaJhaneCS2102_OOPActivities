import encapsulation.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Color of the car: ");
        String color = scanner.nextLine();
        
        System.out.print("Price of the car: ");
        double price = scanner.nextDouble();
        
        System.out.print("Size of the car (S, M, L): ");
        char size = scanner.next().charAt(0);

        Car userCar = new Car(color, price, size);
        
        System.out.println("\nCar details: " + userCar.toString());
        
        scanner.close();
    }

}
