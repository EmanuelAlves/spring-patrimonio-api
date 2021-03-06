package com.emanuel.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.patrimonio.model.Item;
import com.emanuel.patrimonio.repository.ItemRepository;

@RestController("/item")
@CrossOrigin("${origem-permitida}")
public class ItemResource {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping
	public List<Item> list(){
		return itemRepository.findAll();
	}
	
	@PostMapping
	public Item add(@RequestBody @Valid Item item) {
		return itemRepository.save(item);
	}
}
