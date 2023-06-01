public class Task3 {
    public static void main(String[] args) {
        int floor = 2;
        String direction = "Донизу";
        if (floor >= 1 && floor <= 9) {
            if (direction == "Догори") {
                if (floor==2) {
                    System.out.println("Кнопка 2-го поверху не працює! Ви піднялись на 3-й поверх!");
                } else {
                    System.out.println("Ви піднялись на " + floor + "-й поверх!");
                }
            } else if (direction == "Донизу") {
                if (floor==2) {
                    System.out.println("Кнопка 2-го поверху не працює! Ви спустились на 1-й поверх!");
                } else {
                    System.out.println("Ви спустились на " + floor + "-й поверх!");
                }
            }
        }
    }
}
