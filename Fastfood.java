public class Fastfood {

    final String nazev;
    int sklad;

    public Fastfood(String nazev) {
        this.nazev = "BilboSmak";
        this.sklad = 0;
    }


    public void addChicken(int pocet) {
        int storage = sklad - pocet;

        if(storage <= 0) {
            sklad += pocet * 2;
            System.out.println("Naskladnit " + sklad);
        }

        sklad -= pocet;
        System.out.println("Na sklade " + sklad);
    }

    public void sellChickens(int amount) {
        addChicken(amount);
    }
}
