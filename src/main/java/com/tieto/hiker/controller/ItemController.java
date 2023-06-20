package com.tieto.hiker.controller;

import com.tieto.hiker.dto.ItemDto;
import com.tieto.hiker.service.ItemService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {

	private final ItemService itemService;

	@Operation(summary = "Get all available items")
	@GetMapping("/items")
	public List<ItemDto> getAll() {
		return itemService.getAll();
	}

	@Operation(summary = "Add new item")
	@PostMapping("/items")
	public void create(@RequestBody ItemDto request) {
		itemService.create(request);
	}

	@Operation(summary = "Update item")
	@PutMapping("/items/{id}")
	public void update(@PathVariable Long id, @RequestBody ItemDto request) {
		itemService.update(id, request);
	}

	@Operation(summary = "Delete item")
	@DeleteMapping("/items/{id}")
	public void update(@PathVariable Long id) {
		itemService.delete(id);
	}

	@ExceptionHandler({ Exception.class })
	public String handleException(Exception e) {
		return e.getMessage();
	}

}
