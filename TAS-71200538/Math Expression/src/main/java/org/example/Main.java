public class Main {
    public static void main (String[] args){
        OperandNode x = new OperandNode(1);
        OperandNode y = new OperandNode(2);
        OperandNode z = new OperandNode(3);

        OperatorNode ov1 = new Pytagoras(x,y,z);
        System.out.println(ov1.hitung());

        OperandNode a = new OperandNode(2);
        OperandNode b = new OperandNode(3);

        DoubleOperator od = new Pangkat(a,b);
        System.out.println(od.hitung());



    }
}
