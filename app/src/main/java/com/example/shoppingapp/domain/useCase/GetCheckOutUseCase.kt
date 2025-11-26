package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.ProductDataModules
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCheckOutUseCase @Inject constructor(private val repo: Repo) {
    fun getCheckOut(productId: String) : Flow<ResultState<ProductDataModules>> {
        return  repo.getCheckOut(productId)
    }
}
