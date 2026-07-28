public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Observer Pattern ===");

        
        StockMarket appleStock = new StockMarket("AAPL", 175.50);

        
        Observer mobileClient1 = new MobileApp("iPhone Client");
        Observer mobileClient2 = new MobileApp("Android Client");
        Observer webDashboard = new WebApp("Google Chrome Dashboard");

        
        System.out.println("--- Registering Observers ---");
        appleStock.registerObserver(mobileClient1);
        appleStock.registerObserver(mobileClient2);
        appleStock.registerObserver(webDashboard);
        System.out.println();

        
        appleStock.setStockPrice(178.20);
        System.out.println();

        
        System.out.println("--- Deregistering Android Client ---");
        appleStock.deregisterObserver(mobileClient2);
        System.out.println();

        
        appleStock.setStockPrice(180.45);
        System.out.println();

        System.out.println("=== Observer Pattern Test Complete ===");
    }
}
