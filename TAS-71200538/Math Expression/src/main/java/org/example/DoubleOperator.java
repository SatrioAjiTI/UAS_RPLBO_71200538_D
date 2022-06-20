public abstract class DoubleOperator extends Node {
    private Node kiri;
    private Node kanan;

    public DoubleOperator (Node kiri, Node kanan){
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public Node getKiri() {
        return kiri;
    }


    public Node getKanan() {
        return kanan;
    }

    public abstract double hitung();

}
