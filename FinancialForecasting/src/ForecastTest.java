public class ForecastTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Financial Forecasting ===");

        double presentValue = 1000.0; 
        double growthRate = 0.05;    
        int periods = 10;            

        
        System.out.println("--- Recursive Approach ---");
        double futureValueRec = Forecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.printf("Future Value after %d periods: $%.2f%n", periods, futureValueRec);
        System.out.println();

        
        System.out.println("--- Optimized Iterative Approach ---");
        double futureValueIter = Forecasting.calculateFutureValueIterative(presentValue, growthRate, periods);
        System.out.printf("Future Value after %d periods: $%.2f%n", periods, futureValueIter);

        System.out.println("=== Financial Forecasting Test Complete ===");
    }
}
