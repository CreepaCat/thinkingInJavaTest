package access;

import java.util.ArrayList;

/**
 * 单例模式测试
 * Created by ghost on 2017/8/24.
 */
class Connection{
    void print(){
        System.out.println("Connection");
    }
}
public class ConnectionManager {
    private int i=1;
    private static ArrayList<Connection> conn = new ArrayList<Connection>();
    private static ConnectionManager cm = new ConnectionManager();
    static ConnectionManager access(){
        return cm;
    }
    void f(){
        System.out.println("i: "+i);
    }
    void changeInt(int i){
        this.i = i;
    }
    public static void main(String[] args) {

        ConnectionManager cm = ConnectionManager.access();//获得对象的引用
        cm.f();
        ConnectionManager cp = ConnectionManager.access();
        cp.changeInt(2);
        cm.f();
    }
}
