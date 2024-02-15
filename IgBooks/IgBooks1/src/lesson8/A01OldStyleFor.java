package lesson8;

import java.util.*;

public class A01OldStyleFor {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("\nPrice List");
        for(SalesTxn t : tList){
            t.printSummary();
        }
    }
}
