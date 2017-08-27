package access;

/**
 * Created by ghost on 2017/8/24.
 */
class Eat1{
    private Eat1(){}
    public static Eat1 doEat(){
        return new Eat1();
    }
}
class Eat2{
    private Eat2(){}
    private static Eat2 e2 = new Eat2();
    public static Eat2 access(){
        return e2;
    }
    public void f(){
        System.out.println("Singleton test success");
    }
}
public class SingletonTest {
    void testPrivate(){
        //Eat1 e1 = new Eat1();
    }
     void testStatic(){
        Eat1 e1 = Eat1.doEat();
        }
     void testSingleton(){
        Eat2.access().f();
    }

    public static void main(String[] args) {
        SingletonTest st = new SingletonTest();
        st.testPrivate();
        st.testStatic();
        st.testSingleton();
    }

}
