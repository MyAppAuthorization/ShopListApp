package com.example.shoplistapp.domain

class DeleteShopItemUseCase(private var shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)

    }
}