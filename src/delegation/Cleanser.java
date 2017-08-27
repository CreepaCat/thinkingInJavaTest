package delegation;

/**
 * Created by ghost on 2017/8/25.
 */
public class Cleanser {
    private String s = "Cleanser ";
    public void append(String a){ s += a; }
    public void dilute(){ append( "dilute "); }
    public void apply(){ append("apply "); }
    public String toString(){ return s; }
}
