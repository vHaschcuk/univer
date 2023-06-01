public class Task2 {
    public static void main(String[] args) {
        int[] random = new int[20];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(10*Math.random());
            System.out.print(random[i] + " ");
        }
        System.out.println(" ");
        for (int j = 1; j < random.length; j += 2) {
            random[j] = 0;
        }
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
    }
}
