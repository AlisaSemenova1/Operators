import java.util.Objects;

public class JediAndSith {
    enum Sith {
        normal, paladin, dartMol
    }

    enum Dgiday {
        normal, obiVan
    }

    enum Compare {
        equal, above, near
    }

    static boolean sithWin(Sith sith, Compare compare, Dgiday dgiday) {
        switch (sith) {
            case normal:
                switch (dgiday) {
                    case normal:
                        if (Objects.requireNonNull(compare) == Compare.equal) {
                            System.out.println("Победит ситх");
                        }
                        if (Objects.requireNonNull(compare) == Compare.above) {
                            System.out.println("Победит джедай");
                        }
                        if (Objects.requireNonNull(compare) == Compare.near) {
                            System.out.println("Победит джедай");
                        }
                        break;
                    case obiVan:
                        if (compare == Compare.equal & sith == Sith.dartMol)
                            System.out.println("Победит джедай");
                        break;
                }
                break;
            case paladin:
                System.out.println("Победит ситх");
                break;
            case dartMol:
                if (compare == Compare.equal & dgiday == Dgiday.obiVan)
                    System.out.println("Победит джедай");
                break;
        }

        return false;
    }

    public static void main(String[] args) {

        sithWin(Sith.paladin, Compare.equal, Dgiday.obiVan);

    }
}
