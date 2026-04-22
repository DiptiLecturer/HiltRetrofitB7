package org.freedu.retrofithilt

import retrofit2.Call
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val apiService: ApiService
) {

    fun getProducts(): Call<List<Product>> {
        return apiService.getProducts()
    }
}