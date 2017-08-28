package interfaces02;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract   String process(Object input);
    public static String s = "this is for test";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Lowcase(), s);
        Apply.process(new Splitter(), s);
    }
}
class Upcase extends StringProcessor{
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
class Lowcase extends StringProcessor{
    @Override
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
