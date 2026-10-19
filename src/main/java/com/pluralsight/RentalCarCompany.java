package com.pluralsight;

import java.util.Scanner;

public class RentalCarCompany {
    //creating main
    public static void main(String[] args) {

        //creating scanner
        Scanner rentalCar = new Scanner(System.in);

        pickupDate(rentalCar);


    }
    //creating methods that ask the questions
    public static  String pickupDate(Scanner rentalCar){

        System.out.println("What day would you like to pickup: ");

        String pickup = rentalCar.next();

        System.out.println("Your pickup date is: " + pickup);

        return pickup;
    }

    public static String(Scanner rentalCar){
        System.out.println("Days with rental");

    }

}
