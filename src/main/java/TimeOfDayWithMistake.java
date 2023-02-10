public class TimeOfDayWithMistake {
    public static void main(String[] args) {
        timeOfDay(6);
        timeOfDay(14);
        timeOfDay(18);
        timeOfDay(2);
        timeOfDay(-5);
        timeOfDay(26);
    }
    public static void timeOfDay(int time) {
        if (time <= 11 & time >= 4) {
            System.out.println("Утро");
        } else if (time >= 12 & time <= 16) {
            System.out.println("День");
        } else if (time >= 17 & time <= 23) {
            System.out.println("Вечер");
        } else if (time >= 0 & time <= 5) {
            System.out.println("Ночь");
        } else if (time < 0) {
            System.out.println("Введите правильно время.");
        } else if (time > 24) {
            System.out.println("Вернитесь на Землю.");
        }
    }
}
