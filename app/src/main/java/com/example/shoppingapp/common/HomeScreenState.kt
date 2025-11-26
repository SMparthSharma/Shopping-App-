package com.example.shoppingapp.common

import com.example.shoppingapp.domain.models.BannerDataModels
import com.example.shoppingapp.domain.models.CartDataModules
import com.example.shoppingapp.domain.models.ProductDataModules

data class HomeScreenState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val products: List<ProductDataModules>? = null,
    val categories: List<CartDataModules>? = null,
    val banner:List<BannerDataModels>? = null,

    )
