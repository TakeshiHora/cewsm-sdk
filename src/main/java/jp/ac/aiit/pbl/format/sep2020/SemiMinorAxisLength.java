package jp.ac.aiit.pbl.format.sep2020;

public class SemiMinorAxisLength {

    private long value;

    public SemiMinorAxisLength(String axis){
        this.value = AxisLength.getById(axis).getLength();
    }

    public long value(){
        return value;
    }
}
