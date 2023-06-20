package com.tieto.hiker.dto;

import com.tieto.hiker.constant.ItemType;
import com.tieto.hiker.constant.Season;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {

	//TODO: should not expose internal ids
	private Long id;
	private String name;
	private ItemType type;
	@Schema(description = "Weight in grams")
	private Integer weight;
	@Schema(description = "Is item required for warm or cold season, if both set to NULL", nullable = true)
	private Season season;
	@Schema(description = "How many items required per day, if one is sufficient for the hike set to NULL", nullable = true)
	private Integer requiredPerDay;

}
