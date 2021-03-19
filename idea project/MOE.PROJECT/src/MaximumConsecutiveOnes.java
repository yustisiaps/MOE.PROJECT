import java.util.Scanner;

public class MaximumConsecutiveOnes {

    public static void main(String [] args){
        int[] array = {1,1,1,0,1,1,1,1,0,1,1,1};
        System.out.println(counting(array));
    }
    public static int counting(int[] array) {
        int count = 0;
        int maximum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                maximum = Math.max(count, maximum);
            } else {
                count = 0;
            }
        }
        return maximum;
    }
}
