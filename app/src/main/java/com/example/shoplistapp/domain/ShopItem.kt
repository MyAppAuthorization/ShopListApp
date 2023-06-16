package com.example.shoplistapp.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enable: Boolean,
    var id: Int = UNDEFFINED_ID
)
{
    companion object {
           const val UNDEFFINED_ID = -1
        }
}
