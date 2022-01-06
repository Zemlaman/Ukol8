import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Fastfood> list = new ArrayList<>();
        Fastfood fastfood = new Fastfood("BilboSmak");


        System.out.println("Cauko, vytej v BilboSmaku");
        System.out.println("Zadejte pocet kurat, ktere si prejete objednat nebo napiste END pro ukonceni ");

        while(sc.hasNextInt()){
            String input = sc.nextLine();
            if(input.toUpperCase().equals("END")){
                break;
            }
            fastfood.sellChickens(Integer.parseInt(input));
        }
    }
}
