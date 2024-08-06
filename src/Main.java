//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("AD 315 Assignment: Permutation and Combination");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Enter 1 for permutation or 2 for combination");
            option = scanner.nextInt();
        } while (option !=1 && option !=2) ;

        if (option == 1) {
            permutation();
        } else {
            combination();
        }

    }

    public static void permutation() {
        Scanner scanner = new Scanner(System.in);

        // Get the set of items from the user
        System.out.println("Enter the items in the set (separated by spaces):");
        String[] items = scanner.nextLine().split(" ");


        // Get the number of items to be arranged
        System.out.println("Enter the number of items to be arranged:");

        int r = scanner.nextInt();

        // Generate and display combinations
        List<List<String>> permutations = generatePermutation(items, r);

        System.out.println("Permutations:");

        for (List<String> permutation : permutations) {
            System.out.println(permutation);
        }

        scanner.close();
    }

    public static void combination() {
        Scanner scanner = new Scanner(System.in);

        // Get the set of items from the user
        System.out.println("Enter the items in the set (separated by spaces):");
        String[] items = scanner.nextLine().split(" ");


        // Get the number of items to be arranged
        System.out.println("Enter the number of items to be arranged:");

        int r = scanner.nextInt();

        // Generate and display combinations
        List<List<String>> combinations = generateCombinations(items, r);

        System.out.println("Combinations:");
        for (List<String> combination : combinations) {
            System.out.println(combination);
        }

        scanner.close();
    }

    private static List<List<String>> generatePermutation(String[] items, int r) {
        List<List<String>> permutations = new ArrayList<>();
        generateCombinationsHelper(items, r, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void generatePermutationHelper(String[] items, int r, int start, List<String> current, List<List<String>> combinations) {
        if (current.size() == r) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < items.length; i++) {
            current.add(items[i]);
            generateCombinationsHelper(items, r, i + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }

    private static List<List<String>> generateCombinations(String[] items, int r) {
        List<List<String>> combinations = new ArrayList<>();
        generateCombinationsHelper(items, r, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    
    private static void generateCombinationsHelper(String[] items, int r, int start, List<String> current, List<List<String>> combinations) {
        if (current.size() == r) {
            combinations.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < items.length; i++) {

            current.add(items[i]);

            generateCombinationsHelper(items, r, i + 1, current, combinations);

            current.remove(current.size() - 1);

        }

    }


}