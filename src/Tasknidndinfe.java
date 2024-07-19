import java.util.Arrays;

public class Tasknidndinfe {
    public static void main(String[] args) {
        findMissingInt(new int[]{1, 2,3,4, 6, 7});
        System.out.println(Arrays.toString(consecutiveInsert(new int[]{3,4,5,6, 7, 9}, 8)));
    }
    public static int findMissingInt(int[] arr) {
        int startingNum = arr[0];
        for (int i = 0; i < arr.length; i ++){
            if ( arr[i] == startingNum){
                startingNum++;
            }
        }

        System.out.println(startingNum);

        return startingNum;

    }
    public static int[] consecutiveInsert(int[] arr, int missingNum) {
        // Complete the method as described.
        int startingNum = arr[0];

        int[] newArray = new int [arr.length + 1];
        newArray[newArray.length -1 ] =  arr[arr.length -1];
        for (int i = 0; i < arr.length; i++){
            if ( arr[i] == startingNum){
                startingNum++;
                newArray[i] = arr[i];
            } else if (arr[i] != startingNum){
                newArray[i]= startingNum;
                startingNum++;
            }
        }
        return newArray;
    }
}
