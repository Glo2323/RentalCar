package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    //creating main
    public static void main(String[] args) {

        //creating scanner
        Scanner rentalCar = new Scanner(System.in);

        //Placing my Methods down
        pickupDate(rentalCar);
        rentalCar.nextLine();

        //Gathering base price
        double basePrice = 29.99;


        //adding the option price
        double optionPrice = 0;
        double total = 0;
        double tollTag = 0;
        double GPS = 0;
        double roadside = 0;

        //asking if they want toll tag
        if (electronicTollTag(rentalCar).equalsIgnoreCase("yes")){
            tollTag = 3.95;
        }

        //asking if they want gps
        if (wantGPS(rentalCar).equalsIgnoreCase("yes")){
            GPS = 2.95;
        }

        //asking if they want roadside assistance
        if (roadsideAssistance(rentalCar).equalsIgnoreCase("yes")){
            roadside =  3.95;
        }

        //finding the option price
        optionPrice = basePrice + tollTag + GPS + roadside;


        //finding out the daily cost
        total = optionPrice * daysWithRental(rentalCar);


        //asking for age
        double yourAgePrice = 0;
        if (age(rentalCar) < 25){
            yourAgePrice = basePrice * .30;
        }


        //finding the total
        double fullPrice = 0;

        fullPrice = total + yourAgePrice;

        // Giving out the info
        System.out.printf("Your full price for the rental will be $%.2f", fullPrice);

    }
    //creating methods that ask the questions
    public static  String pickupDate(Scanner rentalCar){

        System.out.println("What day would you like to pickup: ");

        String pickup = rentalCar.next();

        System.out.println("Your pickup date is: " + pickup);

        return pickup;
    }

    public static int daysWithRental(Scanner rentalCar ){

        System.out.println("How many days with rental: ");

        int daysWithRental = rentalCar.nextInt();

        System.out.println("You will have the rental for " + daysWithRental + " days.");

        return daysWithRental;

    }

    //asking if they want toll tag
    public static String electronicTollTag(Scanner rentalCar){

        System.out.println("Would you like a electronic toll tag: Yes/No ");

        String tollTag = rentalCar.nextLine();

        System.out.println("You picked: " + tollTag + " additional charger of $3.95 a day");

        return  tollTag;

    }

    //asking if they want gps
    public static String wantGPS(Scanner rentalCar){

        System.out.println("Would you like GPS: Yes/No ");

        String GPS = rentalCar.nextLine();

        System.out.println("You picked: " + GPS + " additional charger of $2.95 a day");

        return GPS;
    }

    //asking if they want roadside assistance
    public static String roadsideAssistance(Scanner rentalCar){

        System.out.println("Would you like roadside assistance: Yes/No ");

        String roadSide = rentalCar.nextLine();

        System.out.println("You picked: " + roadSide + " additional charger of $3.95 a day");

        return roadSide;
    }

    //asking for age
    public static int age(Scanner rentalCar){

        System.out.println("What is your age: ");

        int yourAge = rentalCar.nextInt();

        System.out.println("Your age: " + yourAge);

        return yourAge;
    }



}
