package com.tieto.hiker.exception;

import com.tieto.hiker.service.BackpackService;

import static java.lang.String.format;

public class HikeDistanceLimitException extends RuntimeException {

	public HikeDistanceLimitException() {
		super(format("This app can only advise for hikes no longer than %s km, for longer hikes consult with professionals",
				BackpackService.MAX_DISTANCE)
		);
	}
}
