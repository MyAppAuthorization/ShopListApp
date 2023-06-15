package com.example.shoplistapp.domain

class EditShopItemUseCase(private var shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem:ShopItem){
        shopListRepository.editShopItem(shopItem)
    }
}