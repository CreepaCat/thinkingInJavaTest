package rodent;
abstract class Abstract{
    public void entity(){
        System.out.println("entity");
    }
}
abstract class Rodent {
    private static long  i = 0;
    public Rodent(){
        System.out.println("create rodent " + this);
    }
    public void eat(){
        System.out.println("eat like a rodent");
    }
    public abstract void sleep();
    //public abstract void play();
}
class Mouse extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Mouse");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
class Gerbil extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Gerbil");
    }
    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
class Hamster extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Hamster");
    }
    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}


public class RodentEat{
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};
        for (Rodent r : rodents){
            r.eat();
        }
        //Abstract ab = new Abstract();//抽象类不能新建对象
    }
}
