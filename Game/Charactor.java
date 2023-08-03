package Game;

public class Charactor {
    private String name;
    private int health;
    private int maxHealth;

    public Charactor(String name, int health) {
        this.name = name;
        this.health = health;
        maxHealth = health;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    
    private void decreaseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0) this.health = 0;
    }
    
    public void attack(Charactor target){
        int minDamage = 1;
        int maxDamage = 20;
        int randomDamage = (int)(Math.random() * (maxDamage - minDamage + 1) + 1);
        target.decreaseHealth(randomDamage);
        System.out.println(getName() + " attacks " + target.getName() + " for " + randomDamage + " damage!");
    }
    
    public void heal(){
        int minHeal = 1;
        int maxHeal = 10;
        int randomHeal = (int)(Math.random() * (maxHeal - minHeal + 1) + 1);
        this.health += randomHeal;
        if (this.health > this.maxHealth) this.health = this.maxHealth;
        System.out.println(getName() + " heals for " + randomHeal + " health!");
    }
    
    public boolean isAlive(){
        return this.health > 0;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", Health:" + health;
    }
}
