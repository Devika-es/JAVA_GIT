import java.util.*;
import java.time.format.*;
import java.time.temporal.*;
import java.time.*;
public class datetime {
    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            String str1=sc.nextLine();
            StringBuilder sb=new StringBuilder(str1);
            sb.insert(0,"01/01/");
            str1=sb.toString();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date1=LocalDate.parse(str1,formatter);
            String str2=sc.nextLine();
            StringBuilder sb1=new StringBuilder(str2);
            sb1.insert(0,"01/01/");
            str2=sb1.toString();
            LocalDate date2=LocalDate.parse(str2,formatter);
            while(!date1.isAfter(date2))
            {
                if(date1.isLeapYear())
                {
                    System.out.println(date1.getYear());
                }
                date1=date1.plusYears(1);
            }
            // long days=ChronoUnit.DAYS.between(date1,date2);
            // long years=ChronoUnit.YEARS.between(date1,date2);
            // long months=ChronoUnit.MONTHS.between(date1,date2);
            // long years=months/12;
            // System.out.println(years+" years "+months%12+" months ");

        }
        catch(Exception e)
        {
            System.out.println("Incorrect date format");
        }
    }
}
