package interfaces02.filter;

public class LowPass extends Filter {
    private double cutoff;
    public LowPass(double cutoff){this.cutoff = cutoff;}
    @Override
    public String name() {
       // return super.name();
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Waveform input) {
       // return super.process(input);
        return input;
    }
}
