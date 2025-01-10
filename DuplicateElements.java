

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        ArrayList<Integer> duplicates = new ArrayList<>();

        try {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j] && !duplicates.contains(numbers[i])) {
                        duplicates.add(numbers[i]);
                    }
                }
            }

            if (!duplicates.isEmpty()) {
                throw new RuntimeException("Duplicate elements found: " + duplicates);
            }

            System.out.println("No duplicates found.");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } 
    }
}
