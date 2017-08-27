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
    }
}
