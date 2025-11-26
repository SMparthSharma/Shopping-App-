package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.CartDataModules
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddToCartUseCase @Inject constructor(private val repo: Repo) {
    fun addToCart(cartDataModules: CartDataModules): Flow<ResultState<String>>{
        return repo.addToCart(cartDataModules)
    }
}

