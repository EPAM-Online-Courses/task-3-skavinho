package efs.task.oop;
public abstract class Monster implements Fighter {
    public int health;
    private int damage;
    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
