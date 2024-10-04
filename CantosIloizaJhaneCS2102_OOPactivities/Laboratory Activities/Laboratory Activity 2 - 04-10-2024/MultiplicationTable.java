import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();

        int[][] arr = new int[size][size];
        
        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int number = i * j;
                arr[i-1][j-1] = number ;

                System.out.printf("%4d" , number);
            }
            System.out.println(); 
        }
        input.close();
    }
}
