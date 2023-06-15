package com.example.shoplistapp.domain

class AddShopItemUseCase(private var shopListRepository:ShopListRepository) {
    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}