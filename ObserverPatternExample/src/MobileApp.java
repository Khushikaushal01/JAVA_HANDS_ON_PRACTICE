public class MobileApp implements Observer {
    private final String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[Mobile App - " + appName + "] Notification: Stock '" 
                           + stockName + "' is now valued at $" + price);
    }
}
