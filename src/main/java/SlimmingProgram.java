
class Data {
    String name;
    int calories;

    Data(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}

public class SlimmingProgram {


    public static void main(String[] args) {
        Data[] foods = {
                new Data("шоколад", 340),
                new Data("каша", 250),
                new Data("сало", 500)
        };
        boolean limitIsOn = true;
        int limitOfCalories = 1400;
        int consumedCalories = 1300;
        for (Data food: foods) {
            if(food.calories + consumedCalories < limitOfCalories) {
                System.out.println("Можно съесть " + food.name);
                limitIsOn = false;
            }
        }
        if (limitIsOn)
            System.out.println("Лимит каллорий на сегодня исчерпан.");
    }
}