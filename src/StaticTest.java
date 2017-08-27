/**
 * Created by ghost on 2017/8/23.
 */
public class StaticTest {
    static int x = 11;
    int y = 22;

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        System.out.println("before change st1.x:" + st1.x);
        StaticTest.x = 12;
        StaticTest st2 = new StaticTest();
        st2.y = 33;
        System.out.println("after change st1.x:" + st1.x + " st1.y: " + st1.y );
    }
}
