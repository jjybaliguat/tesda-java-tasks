

/**
 accept user input and print number pattern
 ex. input = 5
 print
 1
 22
 333
 4444
 55555
 */
import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
