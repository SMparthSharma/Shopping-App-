package com.example.shoppingapp.presentation.navigation

import kotlinx.serialization.Serializable

sealed class SubNavigation {
    @Serializable
    object LoginSignUpScreen : SubNavigation()

    @Serializable
    object HomeScreen : SubNavigation()
}
sealed class Routes{
    object SplashScreen
    @Serializable
    object LoginScreen
    @Serializable
    object SignUpScreen
    @Serializable
    object HomeScreen
    @Serializable
    object ProfileScreen
    @Serializable
    object WishListScreen
    @Serializable
    object CartScreen
    @Serializable
    data class CheckoutScreen(val productId: String)
    @Serializable
    object PayScreen
    @Serializable
    object SeeAllScreen
    @Serializable
    data class EachProductDetailScreen(val productId: String)
    @Serializable
    object AllCategoriesScreen : Routes()
    @Serializable
    data class EachCategoryItemScreen(val categoryName: String)
}









