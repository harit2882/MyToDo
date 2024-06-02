package com.harit.todo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/items")
class ItemController(private val service: ItemService) {
    @GetMapping
    fun getAllItems() = service.getAllItems()

    @GetMapping("/{id}")
    fun getItemById(@PathVariable id: Long) = service.getItemById(id)

    @PostMapping
    fun createItem(@RequestBody item: Item) = service.createItem(item)

    @PutMapping("/{id}")
    fun updateItem(@PathVariable id: Long, @RequestBody item: Item) = service.updateItem(id, item)

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Long) = service.deleteItem(id)
}
