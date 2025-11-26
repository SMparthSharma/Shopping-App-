package com.example.shoppingapp.domain.repo

import android.net.Uri
import com.example.shoppingapp.common.ResultState
import com.example.shoppingapp.domain.models.BannerDataModels
import com.example.shoppingapp.domain.models.CartDataModules
import com.example.shoppingapp.domain.models.CategoryDataModules
import com.example.shoppingapp.domain.models.ProductDataModules
import com.example.shoppingapp.domain.models.UserData
import com.example.shoppingapp.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow

interface Repo {

  fun registerUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>

  fun loginUserWithEmailAndPassword(userData: UserData): Flow<ResultState<String>>

  fun getUserById(uid: String): Flow<ResultState<UserDataParent>>

  fun signOut(): Flow<ResultState<String>>

  fun updateUserData(userDataParent: UserDataParent): Flow<ResultState<String>>

  fun userProfileImage(uri: Uri): Flow<ResultState<String>>

  fun getProductsInLimit(): Flow<ResultState<List<ProductDataModules>>>

  fun getCategoriesInLimit(): Flow<ResultState<List<CategoryDataModules>>>

  fun getAllProducts(): Flow<ResultState<List<ProductDataModules>>>

  fun getProductById(productId: String): Flow<ResultState<ProductDataModules>>

  fun addToCart(cartDataModules: CartDataModules): Flow<ResultState<String>>

  fun addToFav(productDataModules: ProductDataModules): Flow<ResultState<String>>

  fun getAllFav(): Flow<ResultState<List<ProductDataModules>>>

  fun getCart(): Flow<ResultState<List<CartDataModules>>>

  fun getAllCategories(): Flow<ResultState<List<CategoryDataModules>>>

  fun getBanner(): Flow<ResultState<List<BannerDataModels>>>

  fun getCheckOut(productId: String): Flow<ResultState<ProductDataModules>>

  fun getSpecificCategoryItem(categoryName: String): Flow<ResultState<List<ProductDataModules>>>

  fun getAllSuggestedProducts(): Flow<ResultState<List<ProductDataModules>>>
}
