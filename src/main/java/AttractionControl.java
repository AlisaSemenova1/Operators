public class AttractionControl {
    public static void main(String[] args) {
        attractionControl(150, true);
        attractionControl(158 , false);
        attractionControl(165, false);
        attractionControl(163, true);
    }
    public static void attractionControl(int height , boolean parents){
        if (height < 160 & parents){
            System.out.println("Можно идти");
        }
        if (height < 160 & !parents){
            System.out.println("Нельзя идти");
        }
        if (height > 160){
            System.out.println("Можно идти");
        }
    }
}
