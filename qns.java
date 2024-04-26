import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.util.Scanner;
import java.time.LocalTime;

public class qns {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime d1 = LocalTime.parse(str1, formatter1);
        LocalTime d2 = LocalTime.parse(str2, formatter1);
        long hours=ChronoUnit.HOURS.between(d1,d2);
        long min=ChronoUnit.MINUTES.between(d2,d1);
        System.out.println(hours+" hrs "+min+" min"); 
  

    }
}