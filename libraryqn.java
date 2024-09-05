import java.time.*;
import java.time.format.*;
import java.util.*;
import java.time.temporal.*;
public class libraryqn {
    public static void main(String args[])
    {
        // Scanner sc=new Scanner(System.in);
        // String str1=sc.nextLine();
        // DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        // LocalDate date1=LocalDate.parse(str1,formatter);
        // int num1=sc.nextInt();
        // date1=date1.plusDays(num1);
        // System.out.println(date1.format(formatter));




        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH-mm-ss");
        LocalTime time1=LocalTime.parse(str1,formatter);
        LocalTime time2=LocalTime.parse(str2,formatter);
        long seconds=ChronoUnit.SECONDS.between(time1,time2);
        long minutes = seconds/60;
        seconds = seconds%60;
        long hour = minutes/60;
        minutes=minutes%60;
        System.out.println(hour+" hours "+minutes+" minutes "+seconds+" seconds");
    }
}
