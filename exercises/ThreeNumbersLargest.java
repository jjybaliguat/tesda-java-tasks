
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeNumbersLargest {
    
    // Solution 1
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter three numbers: ");
    //     String nums = sc.nextLine();
    //     String[] arrNums = nums.split(" "); // ["5", "6", "7"]
    //     int result = Integer.parseInt(arrNums[0]); // 5
    //     boolean allEqual = true;
    //     for(String strNum : arrNums){
    //         try {
    //             if(Integer.parseInt(strNum) > result){
    //                 result = Integer.parseInt(strNum);
    //                 allEqual = false;
    //             }
    //         } catch (NumberFormatException e) {
    //             continue;
    //         }
    //     }
        
    //     System.out.println(allEqual ? "All numbers are equal" : "The largest Number is: " + result);
        
    // }

    // Second Solution
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrNums = new ArrayList<>();
        final int MAX_INPUT = 3;
        String[] label = {"first", "Second", "Third"};

        for(int i = 0; i < MAX_INPUT; i++){
            System.out.print("Enter " + label[i] + " number: ");
            arrNums.add(sc.nextInt());
        }

        int result = arrNums.get(0);
        boolean allEqual = false;
        for(int i = 1; i < MAX_INPUT; i++){
            allEqual = arrNums.get(i) == result;
            result = Math.max(arrNums.get(i), result);
        }

        System.out.println(allEqual ? "All numbers are equal" : "The largest Number is: " + result);
    }
}
