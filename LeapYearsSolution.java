/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyearssolution;

/**
 *
 * @author llujan2027
 */
import java.util.Scanner;
public class LeapYearsSolution {

    public static void main(String[] args) {
        
        //Initialize isLeapYear
        boolean isLeapYear;
        
        System.out.println("Please input a year, 1582 or later.");
        
        //Run majority of code through LeapYearCalculator method
        isLeapYear = LeapYearCalculator();
        
        //Determine what line of code to print out
        if (isLeapYear == false){
            System.out.println("Your year is not a leap year!");
        }else{
            System.out.println("Your year is a leap year!");
        }
    }
    
    //Actual leap year calculator
    public static boolean LeapYearCalculator(){
        
        //Initialize Scanner
        Scanner scan = new Scanner(System.in);
        //Scan for year
        int year = scan.nextInt();
        //Set minimum year (beginning of Gregorian Calender usage)
        final int MIN_YEAR = 1582;
        
        //Root out all years before MIN_YEAR
        if (year < MIN_YEAR){
            System.out.println("Invalid year! Please try again.");
            //Re-do LeapYearCalculator until a valid year is put in
            LeapYearCalculator();
            
        //See if year is divisible by 4    
        }else if ((year%4)!=0){
            System.out.println("You entered: " + year);
            //If indivisible by 4, year is not a leap year
            return false;
        } else {
            System.out.println("You entered: " + year);
            //See if year is divisible by 100
            if (year%100!=0){
                //If divisible by 4 and not 100, year is a leap year
                return true;
            //See if year is divisible by 400
            }else if (year%400==0){
                //If year is divisible by 400, year is a leap year
                return true;
            }else{
                /*If year is divisible by 100 and not 400,
                year is not a leap year*/
                return false;
            }
        }
        //Failsafe for compilation error
        return false;
        
    }
}    
