package factory.derekbanas;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.println("What type of ship? U, R, or B");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            enemyShip = factory.makeEnemyShip(typeOfShip);
        }


        if (enemyShip != null) {
            doStuff(enemyShip);
        } else {
            System.out.println("Enter a U, R, or B next time");
        }
    }

    private static void doStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoot();
    }
}
