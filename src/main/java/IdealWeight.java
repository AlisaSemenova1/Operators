public class IdealWeight {
    public static void main(String[] args) {
        idealWeight(170, 57);
        idealWeight(165, 76);
        idealWeight(180,74);
    }

    public static void idealWeight(int height, int weight) {
        double idealWeight = (height - 100) * 0.9;
        if (weight <= (idealWeight + 5) & weight >= (idealWeight - 5)) {
            System.out.println("Вес идеальный.");
        } else {
            System.out.println("Вес не идеальный.");
        }
    }

}

