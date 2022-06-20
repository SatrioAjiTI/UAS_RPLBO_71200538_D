public abstract class OperatorNode extends Node {
    private Node kiri;
    private Node kanan;
    private Node tengah;

    public OperatorNode (Node kiri,Node tengah, Node kanan){
        this.tengah = tengah;
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public Node getKiri() {
        return kiri;
    }

    public Node getTengah() {
        return tengah;
    }

    public Node getKanan() {
        return kanan;
    }
    public abstract double hitung();

}
