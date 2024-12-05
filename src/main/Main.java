import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: edited");
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
        
        scanner.close();
    }
}
