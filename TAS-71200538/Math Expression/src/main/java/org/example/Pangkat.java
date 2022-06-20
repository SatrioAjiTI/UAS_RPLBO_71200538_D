import java.lang.Math;

public class Pangkat extends DoubleOperator{

    public Pangkat(Node kiri, Node kanan) {
        super(kiri, kanan);
    }

    @Override


    public double hitung() {
        return Math.pow(this.getKiri().hitung(),this.getKanan().hitung());
    }
}
