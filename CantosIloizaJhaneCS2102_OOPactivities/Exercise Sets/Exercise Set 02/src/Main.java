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

/*Example Strings to Input:
1. For a red car priced at 19999.85 and of medium size: 
Color of the car: red
Price of the car: 19999.85
Size of the car: s
Output: Car (red) - P19999.85 - medium

2. For a blue car priced at 50000.00 and large: 
Color of the car: blue
Price of the car: 50000
Size of the car: l
Output: Car (blue) - P50000.00 - large*/
