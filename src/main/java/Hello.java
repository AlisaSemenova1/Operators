public class Hello {
    public static void main(String[] args) {
        hello(7, 4);
        hello(9, 3);
        hello(12, 1);
        hello(10, 6);
        hello(13, 7);
        hello(17, 7);
        hello(19, 6);
    }

    public static void hello(int time, int dayOfWeek) {
        if (time <= 8 & time < 11 & dayOfWeek <= 5) {
            System.out.println("Доброе утро.");
        }
        if (time > 8 & time <= 11 & dayOfWeek <= 5) {
            System.out.println("Всё пропало ты проспал!");
        }
        if (time > 11 & dayOfWeek <= 5) {
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул.");
        }
        if (time <= 12 & dayOfWeek >= 6) {
            System.out.println("Доброе утро!");
        }
        if (time > 12 & time <= 16 & dayOfWeek >= 6) {
            System.out.println("Лучше поспать ещё");
        }
        if (time > 16 & time < 18 & dayOfWeek >= 6) {
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак");
        }
        if (time >= 18 & dayOfWeek >= 6) {
            System.out.println("Даа, с режимом надо что-то делать");
        }

    }
}
