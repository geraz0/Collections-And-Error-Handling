import java.util.*;

public class CollectionsAndErrors {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(11, 22, 33, 44, 55, 66, 22, 33);

        // Using a Set to remove duplicates
        Set<Integer> integerSet = new HashSet<>(integerList);

        // Calculating the sum and average
        int sum = 0;
        for (int number : integerList) {
            sum += number;
        }
        double average = 0;
        if (!integerList.isEmpty()) {
            average = sum / (double) integerList.size();
        }

        // Printing results
        System.out.println("Original List: " + integerList);
        System.out.println("List without duplicates: " + integerSet);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Exception handling
        try {
            // Potential exception scenarios
            System.out.println(integerList.get(10)); // May throw IndexOutOfBoundsException
            System.out.println(100 / 0);             // May throw ArithmeticException
        } catch (IndexOutOfBoundsException | ArithmeticException ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        } finally {
            System.out.println("This block is executed regardless of exceptions.");
        }
    }
}
