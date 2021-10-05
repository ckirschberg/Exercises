import java.util.Random;

public class LotsOfNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random rand = new Random();

        for(int i=0; i < numbers.length; i++) {
            int randomNumber = rand.nextInt(11);
            numbers[i] = randomNumber;
        }

        int[] count = new int[11]; // 11 different numbers from 0 - 10
        for(int i=0; i< numbers.length; i++) {
            count[numbers[i]]++;
        }

        System.out.println("value\t occurences");
        for(int i=0; i< count.length; i++) {

            System.out.println(i + "'s: \t" +count[i]);
        }


    }
}
