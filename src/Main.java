public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int myGrowth = 176;
        int myWeight = 96;
        double myBmi = calculate.bmi(myGrowth,myWeight);
        System.out.println(myBmi);
    }
}