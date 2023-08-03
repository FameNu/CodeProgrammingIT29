package Lab4;

public class Droid {
    private String name;
    private int battery;

    public Droid(String name) {
        this.name = name;
        this.battery = 100;
    }

    public String getName() {
        return name;
    }
    public int getBattery() {
        return battery;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBattery(int battery) {
        this.battery = battery;
    }
    
    public void performTask(String task){
        if (task.isBlank() || task.isEmpty()) return;
        if (getBattery() <= 0){
            System.out.println("Droid " + getName() + " is running out of ");
            return ;
        }
        battery -= 10;
        if (battery < 0) battery = 0;
        System.out.println("Droid is performing - " + task);
    }
    
    public void chargeBattery(int amount){
        if (amount < 0) return;
        battery += amount;
        if (battery > 100) battery = 100;
        System.out.println("Droid - " + getName() + " : " + battery);
    }
    
    @Override
    public String toString() {
        return "Droid - " + name + " : " + battery;
    }
}
