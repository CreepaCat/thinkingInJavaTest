package test171;

abstract class Instrument {
    public Instrument(){
        new Music().print();
    }
    public abstract void print();
}
public class Music extends  Instrument{
    int i = 9;
    public void print(){
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        new Music().print();//无限递归导致栈溢出
    }

}
