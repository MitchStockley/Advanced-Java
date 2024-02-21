package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupllier {
    public static void main(String[] args) {
        List<SalesTxn> tList = new ArrayList<>(10);

        Supplier<SalesTxn> txnSupplier = () -> new SalesTxn.Builder()
                .txnId(101)
                .salesPerson("Mike Adams")
                .buyer(Buyer.getBuyerMap().get("PriceCo"))
                .product("Widget")
                .paymentType("Cash")
                .unitPrice(20)
                .build();

            tList.add(txnSupplier.get());
            tList.stream()
                    .forEach(SalesTxn::printSummary);
    }
}
