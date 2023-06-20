package com.tieto.hiker.constant;

import java.time.LocalDate;

public enum Season {

	WARM,
	COLD;

	public static Season fromDate(LocalDate date) {
		int month = date.getMonthValue();
		return month > 5 && month < 10 ? WARM : COLD;
	}
}
