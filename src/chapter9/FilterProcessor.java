package chapter9;

public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform =new Waveform();
        Apply2.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply2.process(new FilterAdapter(new HighPass(3.0)),waveform);
        Apply2.process(new FilterAdapter(new BandPass(1.0,3.0)),waveform);
    }

}

class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
