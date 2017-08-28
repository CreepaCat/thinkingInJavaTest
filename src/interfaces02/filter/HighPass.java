package interfaces02.filter;

public class HighPass extends Filter {
    private double cutoff;
    public HighPass(double cutoff){this.cutoff = cutoff;}
    @Override
    public String name() {
       // return super.name();
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Waveform input) {
        //return super.process(input);
        return input;
    }
}
