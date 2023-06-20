package com.tieto.hiker.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BackpackDto {

	private List<BackpackItemDto> items;
	@Schema(description = "Weight in grams")
	private int totalWeight;

}
