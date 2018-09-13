package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class DateUtils {
	public static String getDatetime(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date_str = sdf.format(date);
		return date_str;
	}
	public static String getDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date_str = sdf.format(date);
		return date_str;
	}
	
	public static Date getDBDate(String date) {
		Date d = null;
		try {
			d = Date.valueOf(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static Date getDBDatetime(String date) {
		Date d = null;
		
		try {
			d= Date.valueOf(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}
}
