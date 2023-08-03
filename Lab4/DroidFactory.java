package Lab4;

public class DroidFactory {
    private Droid[] droids;
    private int count;

    public DroidFactory(int capacity) {
        droids = new Droid[capacity];
        count = 0;
    }
    
    public void produceDroid(String name){
        if (count > droids.length){
            System.out.println("Droid Factory is at max capacity");
            return ;
        }
        droids[count++] = new Droid(name);
    }
    
    public void listDroid(){
        for(int i = 0; i < droids.length; i++) System.out.println(this.droids[i]);
    }
}
