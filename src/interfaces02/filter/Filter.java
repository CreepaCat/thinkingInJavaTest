package interfaces02.filter;

public class Filter {
    public String name(){return getClass().getSimpleName();}
    public Waveform process(Waveform input){return input;}
}
