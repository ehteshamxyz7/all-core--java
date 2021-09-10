package com.basic.program;

import java.sql.Time;


import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

public class Date {

	public static void main(String[] args) {

		/*
		 * LocalDate id = LocalDate.now(); System.out.println(id.getDayOfMonth());
		 * System.out.println(id.getDayOfYear()); System.out.println(id.getDayOfWeek());
		 * System.out.println(id.getMonth()); System.out.println(id.getYear());
		 * System.out.println(id.getMonthValue());
		 */

		ZoneId zi = ZoneId.of("America/Los_Angeles");
		ZonedDateTime time = ZonedDateTime.now(zi);
		System.out.println(time);
		
		Optional<String> li= Optional.empty();
		System.out.println(li);
	}

}
