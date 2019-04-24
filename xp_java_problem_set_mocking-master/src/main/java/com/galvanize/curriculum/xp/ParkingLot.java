import java.text.DecimalFormat;
import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("$##.00");

        System.out.print("Enter the number of cars parked : ");
        final int NUMBER_OF_CARS = keyboard.nextInt();

        double hoursParked=0;
        double currentCost=0;
        double totalCost=0;

        for(int count = 1; count<=NUMBER_OF_CARS; count++)
        {
            System.out.print("Enter hours parked for car " + count + ": ");
            hoursParked = keyboard.nextDouble();
            currentCost = calculateCharges(hoursParked); //most recent customer
            totalCost+=currentCost; //Running total
        }

        System.out.println("Most recent customer paid: "   +  formatter.format(currentCost));
        System.out.println("Running total of receipts: " + formatter.format(totalCost));

    }

    public static double calculateCharges (double numHours)
    {

        double garageCost = 0;

        if

        if(numHours<=1)
            garageCost = 5;

        else if(numHours>1 && numHours<=6)
            garageCost = 30;

        else if ()
            garageCost = 10;

        return garageCost;
    }

}