public class Task5 {
    public static void main(String[] args) {
        int i;
        int count = 0;
        for (i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String hour = String.format("%02d", i);
                String minute = String.format("%02d", j);
                if (hour.charAt(0) == minute.charAt(1) && hour.charAt(1) == minute.charAt(0)) {
                    System.out.println(hour + ":" + minute);
                    count++;
                }
            }
        }
        System.out.println("Кількість співпадінь симетричних комбінацій цифр на електронному годиннику: " + count);
    }
}
