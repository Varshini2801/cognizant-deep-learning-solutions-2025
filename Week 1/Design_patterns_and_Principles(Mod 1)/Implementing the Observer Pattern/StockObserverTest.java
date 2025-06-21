public class StockObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("A1");
        Observer mobile2 = new MobileApp("B2");
        Observer web1 = new WebApp("user123");

        market.registerObserver(mobile1);
        market.registerObserver(mobile2);
        market.registerObserver(web1);

        market.setStockData("TCS", 3580.75);
        System.out.println();

        market.removeObserver(mobile2);
        market.setStockData("INFY", 1456.20);
    }
}
