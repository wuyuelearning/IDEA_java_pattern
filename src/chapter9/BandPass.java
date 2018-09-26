package chapter9;

public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double hightCut){
        this.lowCutoff =lowCut;
        this.highCutoff=hightCut;
    }
    public Waveform process(Waveform input){
        return  input;
    }
}
