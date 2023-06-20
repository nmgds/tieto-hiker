package com.tieto.hiker.service;

import com.tieto.hiker.dto.ItemDto;
import com.tieto.hiker.entity.Item;
import com.tieto.hiker.exception.ResourceNotFoundException;
import com.tieto.hiker.mapper.ItemMapper;
import com.tieto.hiker.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {

	private final ItemRepository itemRepository;

	@Transactional(readOnly = true)
	public List<ItemDto> getAll() {
		return itemRepository.findAll().stream()
				.map(ItemMapper::mapToDto)
				.toList();
	}

	public void create(ItemDto request) {
		itemRepository.save(ItemMapper.mapToEntity(request));
	}

	public void update(long id, ItemDto request) {
		Item item = itemRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
		item.setName(request.getName());
		item.setType(request.getType());
		item.setWeight(request.getWeight());
		item.setSeason(request.getSeason());
		itemRepository.save(item);
	}

	public void delete(long id) {
		itemRepository.deleteById(id);
	}
}
