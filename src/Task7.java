public class Task7 {
    public static void main(String[] args) {
        String[] animals = {"pigeon", "whale", "giraffe", "ladybug", "penguin"};
        for (int i = 0; i < animals.length; i++) {
            int middle = animals.length / 2;
            if (i != middle) {
                System.out.println(animals[i]);
            }


        }
    }
}
