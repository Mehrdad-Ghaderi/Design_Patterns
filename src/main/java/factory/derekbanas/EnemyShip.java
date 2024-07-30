package factory.derekbanas;

public abstract class EnemyShip {
    private String name;
    private double damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void enemyShipShoot() {
        System.out.println(getName() + " attacks and does " + getDamage());
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }
}
