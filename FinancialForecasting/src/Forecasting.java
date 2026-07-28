public class Forecasting {

    
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        
        if (periods == 0) {
            return presentValue;
        }
        
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    
    public static double calculateFutureValueIterative(double presentValue, double growthRate, int periods) {
        double futureValue = presentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
