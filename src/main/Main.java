import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The sum of the array numbers is: " + sum);

        // Calling the function to get the squared numbers array
        int[] squaredNumbers = squareNumbers(numbers);

        System.out.println("The squared numbers are:");
        for (int num : squaredNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

}
