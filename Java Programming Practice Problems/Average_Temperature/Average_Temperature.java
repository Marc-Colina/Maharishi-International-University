import java.util.*;

public class Average_Temperature {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many temperature days do you want to enter?");
    int numDays = scanner.nextInt();

    double[] arrayOfTemperatures = new double[numDays];
    double sumOfTemperatures = 0.0;
    double averageTemperature;
    int countAboveAverageTemp = 0;

    for (int counter = 0; counter < numDays; counter++) {
      System.out.printf("Please enter temperature for Day %d:\n", counter + 1);
      arrayOfTemperatures[counter] = scanner.nextDouble();
      sumOfTemperatures += arrayOfTemperatures[counter];
    }

    averageTemperature = sumOfTemperatures / numDays;
    System.out.printf("Average Temperature: %.2f\n", averageTemperature);
    System.out.println("Temperatures higher than the average : ");

    for (int counter = 0; counter < arrayOfTemperatures.length; counter++) {
      if (arrayOfTemperatures[counter] > averageTemperature) {
        System.out.printf("%.2f degrees\n", arrayOfTemperatures[counter]);
        countAboveAverageTemp++;
      }
    }
    System.out.printf(
        "%d day/s have a temperature higher than the average\n", countAboveAverageTemp);
  }
}
