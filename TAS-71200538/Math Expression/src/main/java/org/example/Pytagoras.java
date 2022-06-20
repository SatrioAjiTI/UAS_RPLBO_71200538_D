public class Pytagoras extends OperatorNode {

    public Pytagoras(Node x, Node y, Node z) {
        super(x,y,z);
    }

    @Override
    public double hitung() {
        double sum = (this.getKiri().hitung()* this.getKiri().hitung()) + (this.getTengah().hitung()*this.getTengah().hitung());
        double hasil = this.getKanan().hitung()*this.getKanan().hitung();
        if (sum == hasil){
            return 1;
        }
        else {
            return -1;
        }
    }


}
