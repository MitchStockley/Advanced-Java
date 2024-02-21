package lesson8;

import java.util.List;
import java.util.function.Predicate;

public class A03MethodReference {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Predicate<SalesTxn> transaCA = t -> t.getState().equals(State.CA);

//        System.out.println("\nPrice List with ForEach");
//        tList.forEach(t-> t.printSummary());

        System.out.println("Using Lambda");

        tList.stream()
                .filter(transaCA)
                .forEach(SalesTxn::printSummary);
    }


}
