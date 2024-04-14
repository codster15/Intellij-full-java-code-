package com.bro;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ){

                        int day = 1;
                        int date = 1;
                        String month = "january";
                        int year = 2024;


                        while(day > 0){

                            if(day == 72){

                                return;

                            }
                            if(date == 32){
                                date = 1 ;
                                month = "february";
                            }
                            if(date == 30 && month.equals("february")){
                                date = 1 ;
                                month = "march";
                            }


                            System.out.println();
                            System.out.println();
                            System.out.println(".                            Day - "+day);
                            System.out.println(".                        " + date + " " + month + " " + year);
                            System.out.println();
                            System.out.println();
                            System.out.println("============================================================================================");

                            day++;
                            date++;

                        }
    }
}
