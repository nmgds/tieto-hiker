package com.tieto.hiker.mapper;

import com.tieto.hiker.dto.ItemDto;
import com.tieto.hiker.entity.Item;

//TODO: Use something like MapStruct instead
public class ItemMapper {

	private ItemMapper() {}

	public static Item mapToEntity(ItemDto item) {
		return Item.builder()
				.name(item.getName())
				.type(item.getType())
				.weight(item.getWeight())
				.season(item.getSeason())
				.requiredPerDay(item.getRequiredPerDay())
				.build();
	}

	public static ItemDto mapToDto(Item item) {
		return ItemDto.builder()
				.id(item.getId())
				.name(item.getName())
				.type(item.getType())
				.weight(item.getWeight())
				.season(item.getSeason())
				.requiredPerDay(item.getRequiredPerDay())
				.build();
	}
}
