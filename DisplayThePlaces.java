package places;

import java.util.Scanner;
import places.PlaceToLive;
import static java.lang.System.*;

public class DisplayThePlaces {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
      
        out.print("\nHow many places to live would you like to deal with? (Integer, please) ");
        int numberOfPlaces = keyboardScanner.nextInt();
        out.println("\nWe got " + numberOfPlaces + " places to deal with.\n");

        for (int plcNum = 1; plcNum <= numberOfPlaces; plcNum++) {
            var anPlace = new PlaceToLive();
            Scanner aScanner = new Scanner(System.in);

            out.print("Enter the Address of Place " + plcNum + ": ");
            String address = aScanner.nextLine();
            anPlace.setAddress(address);

            out.print("Enter its number of bedrooms: ");
            int numOfBedrooms = aScanner.nextInt();
            anPlace.setNumberOfBedroom(numOfBedrooms);

            out.print("Enter its area (square foot): ");
            double area = aScanner.nextDouble();
            anPlace.setArea(area);

            out.print("Enter the cost of living in the place: $");
            double costOfLiving = aScanner.nextDouble();

            double costPerSquare = costOfLiving / area;
            double costPerBedroom = costOfLiving / numOfBedrooms;

            out.printf("The living place (%s) has an area of %d square feet and costs $%,.2f in total. It costs $%,.2f per square and $%,.2f per bedroom.\n", 
                       anPlace.getAddress(), anPlace.getNumberOfBedroom(), costOfLiving, costPerSquare, costPerBedroom);

        }
    }
}
