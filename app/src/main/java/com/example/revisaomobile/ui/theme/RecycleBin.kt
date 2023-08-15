package com.example.revisaomobile.ui.theme

class RecycleBin(val category: String, val color: String, val items: MutableList<RecycleItem> = mutableListOf()) {
    fun addItem(item: RecycleItem) {
        items.add(item)
    }
}