
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("AD 315 Assignment: Permutation and Combination");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total item number");
        int totalItem = scanner.nextInt();

        System.out.println("Enter number of items to be chosen or arranged");
        int itemsChosen = scanner.nextInt();

        permutation(totalItem, itemsChosen);
        combination(totalItem, itemsChosen);

        scanner.close();
    }

    public static void permutation(int n, int r) {
        System.out.println("The number of permutation is " + factorial(n)/factorial(n-r) + " .");
    }

    public static void combination(int n, int r) {
        System.out.println("The number of combination is " + factorial(n)/factorial(n-r)/factorial(r) + " .");
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i =2; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}