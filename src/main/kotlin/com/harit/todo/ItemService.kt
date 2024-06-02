package com.harit.todo
import org.springframework.stereotype.Service

@Service
class ItemService(private val repository: ItemRepository) {
    fun getAllItems() = repository.findAll()
    fun getItemById(id: Long) = repository.findById(id)
    fun createItem(item: Item) = repository.save(item)
    fun updateItem(id: Long, updatedItem: Item) = repository.save(updatedItem.copy(id = id))
    fun deleteItem(id: Long) = repository.deleteById(id)
}
