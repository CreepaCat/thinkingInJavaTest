
class Static{
    private int i =9;
    protected int j;
    Static(){
        System.out.println("Static invoke");
        System.out.println("i ="+ i +","+ "j ="+ j);
        j=39;
    }
    private static int x1 = printInit("static Static.x1 initialized ");

    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
    //protected static int x1 = print();
}
public class StaticLoadTest extends Static {
    private int k = printInit("StaticLoadTest.k initialized");
    public StaticLoadTest(){
        System.out.println("st invoke");
        System.out.println("k =" + k);
        System.out.println("j =" + j);
    }
    private static int x2 = printInit("StaticLoadTest.x2 initialized");

    public static void main(String[] args) {
        System.out.println("StaticLoadTest constructor");
        Static s = new Static();

    }
}
