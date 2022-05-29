public class BmiService {
    public double bmi(double growth, double weight) {
        double result = weight / ((growth/100) * (growth/100));
        return result;
    }

}