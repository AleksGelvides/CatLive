import java.util.Random;
public class Cat {
    String name;
    int age = catAges();
    boolean hunger;
    boolean healths;
    public int catAges (){
        int catAge;
        if (age == 0){
            catAge = (int) (5 * timecat());}
        else {
            catAge = (int) (age + (long) 5 * timecat());}
        return catAge;
        }

    private long timecat (){
        int timelive = (int) (System.nanoTime() / 1000000000);
        return timelive;
    }
}