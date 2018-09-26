package chapter9;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);
    public static String s="I Want To Know";
    public static void main(String[]  args){
        Apply2.process(new Upcase(),s);
        Apply2.process(new Downcase(),s);
        Apply2.process(new Splitter(),s);
    }
}

class Upcase extends StringProcessor{

    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return   ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor{

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
