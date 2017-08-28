package duotai;

public class Cycles {
    private static RandomCycleGenerator gen = new RandomCycleGenerator();


    public static void main(String[] args) {
        Cycle[] cycle = new Cycle[12];
        //填充Cycle
        for(int i =0;i<cycle.length; i++){
            cycle[i] = gen.next();
        }
        for(Cycle c : cycle){
           // c.ride();
            c.what();
        }
        Cycle[] cb ={new Unicycle(), new Bicycle(), new Tricycle(), new Cycle()};
        for (int i = 0; i<cb.length; i++){
           cb[i].ride();
        }
        for (int i = 0; i<cb.length; i++){
            cb[i].what();
        }

    }
}
