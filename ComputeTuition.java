public class ComputeTuition {

    public static void main(String[] args) {
        double tuition = 10000;
        double annualIncreaseRate = 0.05;

        for (int year = 1; year <= 10; year++) {
            tuition = tuition+(tuition * annualIncreaseRate);
        }

        double tenthYearTuition = tuition;
        System.out.println("Tuition in the tenth year:"+tenthYearTuition);

        double totalCostForFourYears = 0;
        for (int year = 11; year <= 14; year++) {
            tuition = tuition+(tuition * annualIncreaseRate);
            totalCostForFourYears += tuition;
        }

        System.out.println("Total cost for 11th to 14th year:"+ totalCostForFourYears);
    }
}