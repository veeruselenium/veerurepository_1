package samplepackage;

import java.util.Calendar;
import java.util.TimeZone;

public class calendar {

	public static String calendar() {
	
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
 
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
 
        return todayStr;
	}
	public static void main(String[] args) {
		calendar();
	}
}
