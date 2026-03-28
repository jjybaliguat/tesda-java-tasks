// Program that prints the multiplication table from 1-10

public class MultiplicationTable {
    public static void main(String[] args) {
        final int MAX_NUM = 10;
         for(int i = 1; i <= MAX_NUM; i++){
             for(int j = 1; j<= MAX_NUM; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();   
        }
    }
}
