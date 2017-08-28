package interfaces;

//import java.lang.reflect.Array;
import java.util.Arrays;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor{
    String process(Object input){
       // Arrays a = {1,2,1};
        //Arrays动态创建JAVA数组
        //String[] a = ((String)input).split(" ");
      //  return a.toString();
       return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor: "+p.name());
        System.out.println(p.process(s));
    }
    public static String s =
            "This is for test";

    public static void main(String[] args) {
        String[] a = {"this","is","my","test"};
        Arrays b =null;


        process(new Upcase(),s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        System.out.println(b.toString(a));
    }
}
