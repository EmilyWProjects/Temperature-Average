//Import
import java.util.Scanner;

//Class
public class TemperatureAnalysis {

    public static void main(String[] args) {

        //Open scanner
        //Name scanner
        Scanner scanner = new Scanner(System.in);


        //Input
        //Days used to calculate average
        System.out.print("How many daily temperatures will be recorded? ");
        int days = scanner.nextInt(); 
        double[] allTemperatures = new double[days];


        //Loop through days at index i, starting from 0, and store cach temperature in temperatures array
        System.out.println("Enter the temperatures for " + days + " days:");
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            allTemperatures[i] = scanner.nextDouble();
        }


        //Loop until all temperatures are added to a sum, starting from 0
        //Calculate average from sum and days
        double sum = 0;
        for (double temperature : allTemperatures) {
            sum += temperature;
        }
        double averageTemperature = sum / days;


        //Output
        //Loop until all temperatures above average are added to a count, starting from 0
        //Display values and how many days a temperature was above average
        System.out.println("Average temperature: " + averageTemperature);
        int countAboveAverage = 0;
        for (double temperature : allTemperatures) {
            if (temperature > averageTemperature) {
                countAboveAverage++;
            }
        }
        System.out.println("Number of days above average temperature: " + countAboveAverage);


        //Close scanner
        scanner.close();

    }

}