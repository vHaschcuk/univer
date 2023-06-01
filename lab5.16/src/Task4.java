import java.util.Random;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введіть послідовність трьох цілих чисел з проміжку [1;3]. У вас є 2-і спроби!");

        for (int i = 0; i < 2; i++) {
            int progNum1 = (int)(Math.random()*3+1);
            int progNum2 = (int)(Math.random()*3+1);
            int progNum3 = (int)(Math.random()*3+1);

            Scanner scanner = new Scanner(System.in);
            int userNum1 = scanner.nextInt();
            int userNum2 = scanner.nextInt();
            int userNum3 = scanner.nextInt();

            System.out.println("Згенерована послідовність: " + progNum1 + ", " + progNum2 + ", " + progNum3);
            System.out.println("Введена послідовність: " + userNum1 + ", " + userNum2 + ", " + userNum3);

            if (progNum1 == userNum1 && progNum2 == userNum2 && progNum3 == userNum3) {
                System.out.println("Ви вгадали!!! Послідовності співпали!");
            } else {
                if (i<1) {
                    System.out.println("Ви не вгадали. Послідовності не співпали. У вас залишилася 1 спроба.");
                } else {
                    System.out.println("Ви не вгадали. Послідовності не співпали. У вас не залишилося спроб.");
                }
            }
        }
    }
}
