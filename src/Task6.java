import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] intArray = {10, 15, 20, 25, 30};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= i * 2;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
