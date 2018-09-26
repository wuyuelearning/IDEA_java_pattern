package chapter9;

public class Waveform {
    private static long counter;
    private final long id =counter++;
    public String toString(){
        return "Wavefrom"+id;
    }
}
