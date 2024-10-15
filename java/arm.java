import java.util.*;

public class arm {
    public static void main(String[] args) {
        P a = new P();
        a.arm();
    }
}

class P {
    Scanner sc = new Scanner(System.in);

    // Method to check if a number is an Armstrong number
    public void arm() {
        System.out.println("Enter number: ");
        int n = sc.nextInt();  // Input number
        int j = n, count = 0;
        int i, pro, sum = 0;

        // Counting the total number of digits
        while (j > 0) {
            count++;
            j = j / 10;  // Use integer division to remove the last digit
        }

        System.out.println("Total digits: " + count);

        j = n;  // Reset j to the original number

        // Loop through each digit of the number
        while (j > 0) {
            int digit = j % 10;  // Get the last digit
            pro = 1;

            // Raise the digit to the power of 'count' (number of digits)
            for (i = 1; i <= count; i++) {
                pro = pro * digit;  // Calculate digit^count
            }

            sum = sum + pro;  // Add the powered digit to the sum
            j = j / 10;  // Remove the last digit
        }

        // Check if the sum of the digits raised to the power equals the original number
        if (sum == n) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
