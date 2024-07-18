import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner favThings = new Scanner(System.in);
        System.out.print("How many things do you have?");
        int size = favThings.nextInt();
        String[] item  = new String[size];
        favThings.nextLine();


        int count=0;
        while (size > count ){
            System.out.print("Enter Your Thing: ");
            String thing = favThings.nextLine();
            item[count] = thing;
            count++;
        }

        System.out.println("Your favorite things are " + Arrays.toString(item));

    }
}
