package com.xebia.dp.observer.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

	private static SimpleDateFormat simpleDateFormat =
		new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
	
	public static String format(Date date){
		return simpleDateFormat.format(date);
	}
	
}
