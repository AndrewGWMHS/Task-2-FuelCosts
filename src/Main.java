import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gallons = 0;
        double efficiency = 0;
        double pricePerGallon = 0;
        boolean valid = false;
        double costOfTotal;
        double distance;

        do {
            System.out.println("Enter current number of gallons of gasoline inside the vehicle:");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                if (gallons >= 0) {
                    System.out.println("Enter the fuel efficiency in Miles per Gallon");
                    if (scan.hasNextDouble()) {
                        efficiency = scan.nextDouble();
                        if (efficiency > 0) {
                            System.out.println("Enter the price of gas per gallon");
                            if (scan.hasNextDouble()) {
                                pricePerGallon = scan.nextDouble();
                                if (pricePerGallon > 0) {
                                    valid = true;
                                }
                                else {
                                    scan.nextLine();
                                    System.out.println("Invalid value entered, try again.");
                                    System.out.println();
                                }
                            }
                            else {
                                scan.nextLine();
                                scan.nextLine();
                                System.out.println("Invalid data type entered, try again.");
                                System.out.println();
                            }

                        }
                        else {
                            System.out.println("Invalid value entered, try again.");
                            System.out.println();
                        }
                    }
                    else {
                        scan.nextLine();
                        scan.nextLine();
                        System.out.println("Invalid data type entered, try again.");
                        System.out.println();
                    }

                }
                else {
                    System.out.println("Invalid value entered, try again.");
                    System.out.println();
                }
            }
            else {
                scan.nextLine();
                System.out.println("Invalid Data type entered, try again.");
                System.out.println();
            }

        } while (!valid);

        costOfTotal = (pricePerGallon/efficiency) * 100;
        distance = gallons*efficiency;

        System.out.printf("Cost per 100 miles in $: %13.2f", costOfTotal);
        System.out.printf("\nDistance left in miles: %13.2f", distance);
    }
}