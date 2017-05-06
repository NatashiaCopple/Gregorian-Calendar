/*
 Natashia Copple Lab #1 Part 1 - Gregorian Calendar
 */
package mycalendar;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormatSymbols;

public class MyCalendar {

   
    public static void main(String[] args) {
        //variables from book with my info.
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar natashiasBirthday = new GregorianCalendar(1982,GregorianCalendar.DECEMBER, 7);
       //string to change number to actual name
       String[] day = new DateFormatSymbols().getWeekdays();
       //print out today's date
       System.out.println("Today's date is " + (cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+cal.get(GregorianCalendar.YEAR));
       //print out the day today
       System.out.println("Today is "+day[cal.get(GregorianCalendar.DAY_OF_WEEK)]);
       //add 100 days 
       cal.add(Calendar.DAY_OF_MONTH, 100);
       //print out date in 100 days from now
       System.out.println("In 100 days, the date will be "+ (cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+cal.get(GregorianCalendar.YEAR));
       //print out the weekday in 100 days from now
       System.out.println("In 100 days, the day will be "+day[cal.get(GregorianCalendar.DAY_OF_WEEK)]);
       //print out my birthday's weekday 
       System.out.println("The day of my birthday was a "+day[natashiasBirthday.get(GregorianCalendar.DAY_OF_WEEK)]);
       //add 1000 days to my birthday
       natashiasBirthday.add(Calendar.DAY_OF_MONTH, 10000);
       //print out date in 10,000 days
       System.out.println("In 10,000 days from my birthday, the date was " + (natashiasBirthday.get(GregorianCalendar.MONTH)+1)+"/"+(natashiasBirthday.get(GregorianCalendar.DAY_OF_MONTH))+"/"+(natashiasBirthday.get(GregorianCalendar.YEAR)));
       
    }  
    
    
}
