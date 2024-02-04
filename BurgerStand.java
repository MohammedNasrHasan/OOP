
import java.util.Scanner;
 class BurgerStand {
     Scanner s =new Scanner(System.in);
    private int id;
    private int burgersSold;
    private static int totalBurgersSold = 0;

    public BurgerStand(int id, int burgersSold) {
        this.id = id;
        this.burgersSold = burgersSold;
        totalBurgersSold += burgersSold;
    }

    public void justSold() {
        burgersSold++;
        totalBurgersSold++;
    }

    public int getBurgersSold() {
        return burgersSold;
    }

    public static int getTotalBurgersSold() {
        return totalBurgersSold;
    }
 }
