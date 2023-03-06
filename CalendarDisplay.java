package Assignment1;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarDisplay {
	public static void main(String[] args) {  
		var IN = new Scanner(System.in);
		System.out.print("Enter Month between 1 and 12 : ");
		int m = IN.nextInt();
	     Calendar calendar = Calendar.getInstance();
	     int y = calendar.get(Calendar.YEAR);
		 YearMonth ym = YearMonth.of(y, m);
		 System.out.println("\n---------------------------");
		 System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		 System.out.println("---------------------------");
		int cou = 1;
		int day = LocalDate.of(y, m, cou).getDayOfWeek().getValue();
		if (day != 7)
			for (int i = 0; i < day; i++, cou++)
			{
				System.out.printf("%-4s", "");
			}
 
		for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, cou++)
		{
			System.out.printf("%-4d", i);
			if (cou % 7 == 0)
		{
			System.out.println();
		}
		}		
		System.out.println("\n---------------------------");
    }
	}

