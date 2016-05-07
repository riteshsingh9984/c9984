package curiosity.tool_utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {
	
	public static long  getCurrentDateLong(){
		
		Calendar calobj = Calendar.getInstance();
		return calobj.getTimeInMillis();
	}
	
	public static String  getCurrentDate(){
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Calendar calobj = Calendar.getInstance();
		System.out.println(df.format(calobj.getTime()));
		return df.format(calobj.getTime());
	}
}
