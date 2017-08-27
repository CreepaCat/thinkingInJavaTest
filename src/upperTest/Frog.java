package upperTest;

/**
 * Created by ghost on 2017/8/25.
 */
class Amphibian{
    public void clean(){System.out.print("Amphibian");}
    static void cleaner(Amphibian i){
        i.clean();
    }
}
public class Frog extends Amphibian{
    public void clean(){System.out.print("Frog");}
    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian.cleaner(f);

    }
}
