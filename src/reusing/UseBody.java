package reusing;

/**
 * 惰性初始化
 * Created by ghost on 2017/8/24.
 */
public class UseBody {
    Body b ;
    public void print(){
       // b.print("used");//未初始化就调用对象方法导致空指针异常

      if(b == null){
            b = new Body();
            b.print("reusing");
        }

    }


    public static void main(String[] args) {
        UseBody ub = new UseBody();
        ub.print();
    }
}
