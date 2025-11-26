package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.CategoryDataModules
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCategoryInLimitUseCase @Inject constructor(private val repo: Repo) {
    fun getCategoryInLimit(): Flow<ResultState<List<CategoryDataModules>>> {
        return repo.getCategoriesInLimit()
    }
}
