package com.dateTime;

import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateDemo 
{

	public static void main(String[] args) 
	{
		Date date = new Date();
		//System.out.println(date);
		
		Date date2 = new Date(1947,8,15); // -- mean code is deprecated
		//System.out.println(date2);
		
		Locale locale = Locale.getDefault();
		Currency c = Currency.getInstance(locale);
		//System.out.println(locale);
		
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(date1.getDayOfWeek());
		
		LocalDate date4 = LocalDate.of(2002, 12, 01);
		//System.out.println(date4);
		
		DateTimeFormatter javaFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String formattedDate = date1.format(javaFormat);
		//System.out.println(formattedDate);
		
		DateTimeFormatter userFormat =DateTimeFormatter.ofPattern("yyyy/dd/MM| hh:mm:ss");// mm=minute MM = Month
		String formattedDate2 = date1.format(userFormat);
		System.out.println(formattedDate2);
	}

}
