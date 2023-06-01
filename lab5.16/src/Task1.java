import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(41) -20;
        if (randomNumber != 0) {
            System.out.println("Випадкове натуральне число з проміжку [-20; 20]: " + randomNumber);
        }


    }
}