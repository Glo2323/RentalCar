package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    //creating main
    public static void main(String[] args) {

        //creating scanner
        Scanner rentalCar = new Scanner(System.in);

        pickupDate(rentalCar);

        rentalCar.nextLine();

        daysWithRental(rentalCar);

        rentalCar.nextLine();

        electronicTollTag(rentalCar);



        wantGPS(rentalCar);



        roadsideAssistance(rentalCar);


        age(rentalCar);




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

    public static String electronicTollTag(Scanner rentalCar){

        System.out.println("Would you like a electronic toll tag: Yes/No ");

        String tollTag = rentalCar.nextLine();

        System.out.println("You picked: " + tollTag);

        return  tollTag;

    }

    public static String wantGPS(Scanner rentalCar){

        System.out.println("Would you like GPS: Yes/No ");

        String GPS = rentalCar.nextLine();

        System.out.println("You picked: " + GPS);

        return GPS;
    }

    public static String roadsideAssistance(Scanner rentalCar){

        System.out.println("Would you like roadside assistance: Yes/No ");

        String roadSide = rentalCar.nextLine();

        System.out.println("You picked: " + roadSide);

        return roadSide;
    }

    public static String age(Scanner rentalCar){

        System.out.println("What is your age: ");

        String yourAge = rentalCar.nextLine();

        System.out.println("Your age: " + yourAge);

        return yourAge;
    }



}
