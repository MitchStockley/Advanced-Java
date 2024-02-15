package lesson8;

import java.util.List;

public class Ao2ForEach {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();

        System.out.println("\nPrice List with ForEach");
        tList.forEach(t-> t.printSummary());

        System.out.println();

        tList.forEach(t -> System.out.println(
                "id: " + t.getTxnId() + " -seller: " + t.getSalesPerson() + " -Buyer: " + t.getBuyerName() +
                        " -product: " + t.getProduct()
        ));

    }
}
