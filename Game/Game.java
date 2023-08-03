package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Charactor player = new Charactor("Steve", 100);
        Enemies enemies = new Enemies(new Charactor[]{
            new Charactor("Dioblo", 50),
            new Charactor("Rimuru", 300),
            new Charactor("Gao", 70)
        });
        
        System.out.println("Your enemies:");
        enemies.getEnemies();
        
        Charactor opponent = enemies.getRandomEnemies();
        
        System.out.println("Welcome to Monster hunter");
        System.out.println("You are a hunter and your next mission is to defeat " + opponent.getName());
        System.out.println(opponent);
        
        while (player.isAlive() && opponent.isAlive()){
            do {
                System.out.print("\n============\nPress 1 to attack or 2 to heal or 0 to exit game: ");
                choice = sc.nextInt();
                if (!(choice == 1 || choice == 2 || choice == 0)) System.out.println("Invalid choice");
            } while (!(choice == 1 || choice == 2 || choice == 0));
            if (choice == 0) break;
            if (choice == 1) player.attack(opponent);
            else player.heal();
            if (opponent.isAlive()) opponent.attack(player);
            System.out.println("Your health: " + player.getHealth());
            System.out.println(opponent.getName() + "'s health: " + opponent.getHealth());
        }
        if (choice == 0){
            System.out.println("Exit Game");
        }
        else {
            if (!opponent.isAlive()) System.out.println("You finally defeated " + opponent.getName() + "'s, Let's return to camp!");
            else System.out.println("You lose");
        }
        
        System.out.println("\nGoodbye!");
    }
}
