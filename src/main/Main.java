import java.util.Scanner;

public class AddArrayNumbers {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter the multiplier:");
        int multiplier = scanner.nextInt();

        int[] multipliedArray = multiplyArray(numbers, multiplier);
        
        System.out.println("The new array with multiplied numbers is:");
        for (int num : multipliedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int[] multiplyArray(int[] array, int multiplier) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * multiplier;
        }
        return result;
    }
}
