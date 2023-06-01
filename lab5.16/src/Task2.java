import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        double leg1 = 3;
        double leg2 = 4;
        double S = (leg1 * leg2)/2;
        System.out.println("Площа прямокутного трикутника дорівнює " + S);
        double sqhypotenuse = (Math.pow(leg1,2)) + (Math.pow(leg2,2));
        double hypotenuse = Math.sqrt(sqhypotenuse);
        double P = leg1 + leg2 + hypotenuse;
        System.out.println("Периметр прямокутного трикутника дорівнює " + P);
    }
}
