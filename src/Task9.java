import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
    int[] orderedArray = {4,2,9,13,1,0};
        Arrays.sort(orderedArray);
        System.out.println(Arrays.toString(orderedArray));
        System.out.println(orderedArray[0]);
        System.out.println(orderedArray[orderedArray.length -1]);

    }
}
