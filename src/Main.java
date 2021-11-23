import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        //Cerinta 1
         List<Integer> lista1 = op.getPopulatedList(100);
        System.out.println(lista1);
        System.out.println("--------");
         //Cerinta 2
        List<Integer> lista2 = op.getPopulatedList(30);
        int numar = 31;
        System.out.println(op.addNumberToEnd(lista2,14));
        System.out.println("--------");
        //Cerinta 3
        List<Integer> lista3 = op.getPopulatedList(100);
        int inceput = 60;
        op.printListFromNumber(lista3,inceput);
        System.out.println("--------");
        //Cerinta 4
        List<Integer> lista4 = op.getPopulatedList(10);
        op.fromEndToFront(lista4);
        System.out.println("--------");
        //Cerinta 5
        List<String> lista5 = new ArrayList<>();
        lista5.add("Vaza");
        lista5.add("Oaza");
        lista5.add("Trotuar");
        lista5.add("Alfabet");
        int pozitie = 3;
        String adauga = "casa";
        System.out.println( op.insertOnPosition(lista5,adauga,pozitie));
        System.out.println("--------");
        //Cerinta 6
        List<Integer> lista6 = op.getPopulatedList(10);
        int nr = 4;
        System.out.println(op.addOnFirst(lista6,nr));
        System.out.println("--------");
        //Cerinta 7
        List<Integer> lista7 = op.getPopulatedList(10);
        op.displayPositionAndValue(lista7);
        System.out.println("--------");
        //Cerinta 8
        List<Integer> lista8 = op.getPopulatedList(14);
        System.out.println(op.maxNumber(lista8));

    }
}
