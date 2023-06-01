public class Task4 {
    public static void main(String[] args) {
        int i;
        int d = 10;
        int factorial = 1;
        for (i = 1; i <= d; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа 10 дорівнює " + factorial);

        //оператор while
        d = 10;
        i = 1;
        factorial = 1;
        while (i <= d) {
            factorial *= i;
            i++;
        }
        System.out.println("Факторіал числа 10 дорівнює " + factorial);
    }
}
