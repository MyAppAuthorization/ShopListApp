package com.example.shoplistapp.domain

class GetShopItemUseCase(private var shopListRepository: ShopListRepository) {
    fun getShopItem(shopItemId:Int):ShopItem {
         return shopListRepository.getShopItem(shopItemId)

    }
}