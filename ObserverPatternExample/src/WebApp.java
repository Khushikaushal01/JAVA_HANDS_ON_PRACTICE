public class WebApp implements Observer {
    private final String clientName;

    public WebApp(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[Web App Dashboard - " + clientName + "] Display Update: '" 
                           + stockName + "' price has updated to $" + price);
    }
}
