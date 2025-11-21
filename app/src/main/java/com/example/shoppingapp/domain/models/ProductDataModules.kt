package com.example.shoppingapp.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class ProductDataModules(
    val name: String = "",
    val price: String = "",
    val description: String = "",
    val thumbnail: String = "",
    val brand: String = "",
    val category: String = "",
    val discountPrice: String = "",
    val gender: String = "",
    val images: List<String> = emptyList(),
    val inStock: Boolean = false,
    val shortDescription: String = "",
    val currency: String = "",
    val stockCount: Int = 0,
    var productId: String = "",
)
