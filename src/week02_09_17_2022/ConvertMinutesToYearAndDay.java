package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {
 /*
how many minutes we have in an hour? 60 min
how many hours we have in a day? 24 hours
how many days we have in a year? 365 day (it means that 24*365 hours) (it means that 24*365*60 minutes)
  */
     int givenMinutes = 3456789;
     int howManyMinutesInAyear = (24*365*60);
     int year = givenMinutes / howManyMinutesInAyear; //(24*365*60);
     System.out.println("year = " + year);

        int remainderMinutes = givenMinutes % howManyMinutesInAyear;
        System.out.println("remainderMinutes = " + remainderMinutes);

     System.out.println("remainderMinutes = " + remainderMinutes);
     int days = remainderMinutes / (24*60);
     System.out.println( "days = " + days);
   System.out.println(givenMinutes + "minutes is approximately" + +year+" years and "+days+" days");


    }

}
