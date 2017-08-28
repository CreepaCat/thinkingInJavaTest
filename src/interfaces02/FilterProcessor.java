package interfaces02;

import interfaces02.filter.*;

public class FilterProcessor{
     public static void main(String[] args) {
         Waveform w = new Waveform();
         Apply.process(new FilterAdapter02(new LowPass(1.0)), w);
         Apply.process(new FilterAdapter02(new HighPass(2.0)),w);
         Apply.process(new Lowcase(), "String Processor" );

     }
 }
