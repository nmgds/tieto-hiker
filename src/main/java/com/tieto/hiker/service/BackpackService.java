package com.tieto.hiker.service;

import com.tieto.hiker.constant.Season;
import com.tieto.hiker.dto.BackpackDto;
import com.tieto.hiker.dto.BackpackItemDto;
import com.tieto.hiker.exception.HikeDistanceLimitException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class BackpackService {

	private static final int DISTANCE_PER_DAY = 20;
	public static final int MAX_DISTANCE = 100;

	private final ItemService itemService;

	@Transactional(readOnly = true)
	public BackpackDto get(LocalDate date, int distance) {
		if (distance > MAX_DISTANCE) {
			throw new HikeDistanceLimitException();
		}

		var season = Season.fromDate(date);
		var days = (int) Math.ceil((float) distance / DISTANCE_PER_DAY);

		int[] totalWeight = {0};

		var backpackItems = itemService.getAll().stream()
				.filter(item -> item.getSeason() == null || item.getSeason() == season)
				.map(item -> {
					var quantity = item.getRequiredPerDay() == null ? 1 : item.getRequiredPerDay() * days;
					totalWeight[0] += item.getWeight() * quantity;
					return BackpackItemDto.builder()
							.name(item.getName())
							.quantity(quantity)
							.build();
				}).toList();

		return BackpackDto.builder()
				.items(backpackItems)
				.totalWeight(totalWeight[0])
				.build();
	}

}
