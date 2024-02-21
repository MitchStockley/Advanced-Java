package lesson9;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class TestToDoubleFunctiom {
    public static void main(String[] args) {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        SalesTxn first = tList.get(0);

        ToDoubleFunction<SalesTxn> discountFunction = t -> t.getTransactionTotal() * t.getDiscountRate();

        System.out.println("discount for first transaction: " + discountFunction.applyAsDouble(first));
    }
}
