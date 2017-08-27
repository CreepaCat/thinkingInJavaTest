package extend;

/**
 * extends练习
 * Created by ghost on 2017/8/24.
 */
class Art {
    Art(){System.out.println("Art");}
}
class Drawing{
    Drawing(){System.out.println("Drawing");}
   // Drawing d = new Drawing();
}
public class Cartoon extends Drawing{
    Art a = new Art();
    Cartoon(){System.out.println("Cartoon");}
    public static void main(String[] args) {
        ///Art a  ;
        Cartoon c = new Cartoon();
    }
}
