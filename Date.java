package JavaPackage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AddYearsToDate {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	            System.out.print("Enter a date in the format yyyy-MM-dd: ");
	            String dateString = scanner.nextLine();

	            Date date = sdf.parse(dateString);

	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date);
	            calendar.add(Calendar.YEAR, 4);

	            Date updatedDate = calendar.getTime();

	            String updatedDateString = sdf.format(updatedDate);

	            System.out.println("Original Date: " + dateString);
	            System.out.println("Updated Date: " + updatedDateString);
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
	        } finally {
	            scanner.close();
	        }
	    }

}
