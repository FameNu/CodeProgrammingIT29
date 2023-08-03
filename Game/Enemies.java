package Game;

public class Enemies {
    private Charactor[] enemies;

    public Enemies(Charactor[] enemies) {
        this.enemies = enemies;
    }

    public void getEnemies() {
        for (int i = 0; i < enemies.length; i++){
            System.out.println("Enemie#" + (i+1) + ": " + enemies[i]);
        }
    }
    
    public Charactor getRandomEnemies(){
        int randomEnemies = (int)(Math.random() * enemies.length);
        return enemies[randomEnemies];
    }
}
