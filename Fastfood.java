public class Fastfood {

    final String nazev;
    int sklad;

    public Fastfood(String nazev) {
        this.nazev = "BilboSmak";
        this.sklad = 0;
    }

    public void addChicken(int pocet) {
        int updSklad = sklad - pocet;

        if(updSklad <= 0) {
            sklad += pocet * 2;
            System.out.println("Tady mas " + pocet + " kurat brasko");
            System.out.println("Naskladnime " + sklad + " kurat");
        }

        sklad -= pocet;
        System.out.println("Na sklade mame " + sklad + " kurat");
        System.out.println("Kolik kurat si prejete?");
    }

    public void sellChickens(int pocet) {
        addChicken(pocet);
    }
}
