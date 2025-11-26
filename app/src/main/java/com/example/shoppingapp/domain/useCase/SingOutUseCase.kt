package com.example.shoppingapp.domain.useCase

import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SingOutUseCase @Inject constructor(private val repo: Repo) {
    fun signOut(): Flow<ResultState<String>> {
        return repo.signOut()
    }
}
