package adaptor.derekbanas;

public class TestEnemyAttacker {

    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker robotAdaptor = new EnemyRobotAdaptor(enemyRobot);
        System.out.println("The Robot");

        enemyRobot.reactToHuman("Paul");
        enemyRobot.walkForward();
        enemyRobot.smashWithHand();
        System.out.println();

        System.out.println("Enemy Tank");
        enemyTank.assignDriver("Frank");
        enemyTank.driveForward();
        enemyTank.fireWeapon();
        System.out.println();

        System.out.println("The robot with Adaptor");

        robotAdaptor.assignDriver("Mark");
        robotAdaptor.driveForward();
        robotAdaptor.fireWeapon();
    }
}
