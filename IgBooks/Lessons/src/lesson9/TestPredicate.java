package lesson9;



import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Predicate<SalesTxn> massSales = t-> t.getState().equals(State.MA);

        System.out.println("\n sales-stream");

        tList.stream()
                .filter(massSales)
                .forEach(t -> t.printSummary());
    }
}
