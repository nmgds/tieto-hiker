package com.tieto.hiker.controller;

import com.tieto.hiker.dto.BackpackDto;
import com.tieto.hiker.service.BackpackService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class BackpackController {

	private final BackpackService backpackService;

	@Operation(summary = "Get suggested backpack content")
	@GetMapping("/backpack")
	public BackpackDto get(
			@RequestParam @Parameter(required = true, description = "Date of your hike", example = "2023-07-01") LocalDate date,
			@RequestParam @Parameter(required = true, description = "Hike distance in km", example = "50") Integer distance
	) {
		return backpackService.get(date, distance);
	}

	@ExceptionHandler({ Exception.class })
	public String handleException(Exception e) {
		return e.getMessage();
	}
}
