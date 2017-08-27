package rodent;
class Rodent {
    private static long  i = 0;
    public Rodent(){
        System.out.println("create rodent " + this);
    }
    public void eat(){
        System.out.println("eat like a rodent");
    }
}
class Mouse extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Mouse");
    }
}
class Gerbil extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Gerbil");
    }
}
class Hamster extends Rodent{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("eat like a Hamster");
    }
}


public class RodentEat{
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster(),new Rodent()};
        for (Rodent r : rodents){
            r.eat();
        }
    }
}
