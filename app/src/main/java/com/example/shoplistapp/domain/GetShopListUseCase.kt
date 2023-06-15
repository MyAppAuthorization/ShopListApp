package com.example.shoplistapp.domain

class GetShopListUseCase(private var shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
         return shopListRepository.getShopList()
    }
}