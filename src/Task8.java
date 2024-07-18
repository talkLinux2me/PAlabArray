import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] saul = {"ears", "glasses", "hands", "bigBrain", "noHeart"};
        int middle = saul.length / 2;
        String temp = saul[0];
        System.out.println(Arrays.toString(saul));

        saul[0] = saul[middle];
        System.out.println(Arrays.toString(saul));
        saul[middle] = temp;

        System.out.println(Arrays.toString(saul));
    }
}
