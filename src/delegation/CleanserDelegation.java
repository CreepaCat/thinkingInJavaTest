package delegation;

/**
 * Created by ghost on 2017/8/25.
 */
public class CleanserDelegation {
    private String name;
    private Cleanser cleanser = new Cleanser();
    public CleanserDelegation(String name){
        this.name = name;
    }
    //Delegated methods:
    public void append(String velocity){
        cleanser.append(velocity);
    }
    public void dilute(){
        cleanser.dilute();
    }
    public void apply(){
        cleanser.apply();
    }
    public String toString(){
        return cleanser.toString();
    }

    public static void main(String[] args) {
        CleanserDelegation cd = new CleanserDelegation("Delegation test");
        cd.apply();
        System.out.println(cd.toString());
    }
}
