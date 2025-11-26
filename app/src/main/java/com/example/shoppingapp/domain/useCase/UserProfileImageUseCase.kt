package com.example.shoppingapp.domain.useCase

import android.net.Uri
import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.repo.Repo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserProfileImageUseCase @Inject constructor(private val repo: Repo) {
    fun userProfileImage(uri: Uri): Flow<ResultState<String>> {
        return repo.userProfileImage(uri)
    }
}