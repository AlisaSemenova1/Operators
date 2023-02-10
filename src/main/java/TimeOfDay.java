public class TimeOfDay {
    public static void main(String[] args) {
        timeOfDay(1);
        timeOfDay(8);
        timeOfDay(13);
        timeOfDay(19);

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
        }
    }
}