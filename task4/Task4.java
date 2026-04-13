import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<<Welcome to Palindrome checker>>>>>");
        System.out.print("Please enter a word, number or a sequence of character: ");
        String input = sc.nextLine().trim();
        StringBuilder reversed = new StringBuilder(input).reverse();
        if(reversed.toString().equals(input))
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");
    }
}
