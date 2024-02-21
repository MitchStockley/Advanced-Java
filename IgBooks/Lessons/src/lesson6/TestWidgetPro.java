package lesson6;

public class TestWidgetPro {
    public static void main(String[] args) {
    WidgetPro wp = new WidgetPro(500,200,300L,"BigWidget");
        System.out.println(wp.calcProfit());
        wp.printItemReport();

    }
}
