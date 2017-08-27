package duotai;
import java.util.Random;

class Cycle{

    public void ride(){System.out.println("Cycle.ride");}
    public void push(){System.out.println("Cycle.push");}
    public void what(){}
}

class Unicycle extends Cycle {
    @Override
    public void ride(){System.out.println("Unicycle.ride()");}
    @Override
    public void push() {System.out.println("Unicycle.push()");}
    public void what(){
        System.out.println(new Unicycle().getClass().toString());
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride(){System.out.println("Bicycle.ride()");}
    @Override
    public void push() {System.out.println("Bicycle.push()");}
    public void what(){
        System.out.println(new Bicycle().getClass().toString());
    }
}
class Motrobike extends Bicycle{
    public void ride(){System.out.println("Motrobike.ride()");}
    public void push(){System.out.println("Motrobike.push()");}
    public void what(){
        System.out.println(new Motrobike().getClass().toString());
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride(){System.out.println("Tricycle.ride()");}
    @Override
    public void push() {System.out.println("Tricycle.push()");}
    public void what(){
        System.out.println(new Tricycle().getClass().toString());
    }
}

public class RandomCycleGenerator {
    private Random ran = new Random(5);
    public Cycle next(){
        switch (ran.nextInt(4)){
            default:
            case 0: return new Unicycle();
            case 1: return new Bicycle();
            case 2: return new Motrobike();
            case 3: return new Tricycle();
        }
    }
}
