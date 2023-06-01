public class Task2 {
    public static void main(String[] args) {
        //Завдання 2
        int k = 358;
        int max = 0;
        while (k>0) {
            int number = k % 10;
            if (number > max) {
                max = number;
            }
            k/= 10;
        }
        System.out.println("Найбільша цифра числа це " + max);
    }
}
