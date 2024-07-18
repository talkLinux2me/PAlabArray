import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] num6 = {1, 5, 12, 4, 50};

        for (int i = 0; i < num6.length; i++) {
            System.out.println("i is currently at index: " + i + " Current value is: " +num6[i]);

            num6[i] =i;

        }
        System.out.println(Arrays.toString(num6));
    }
}
