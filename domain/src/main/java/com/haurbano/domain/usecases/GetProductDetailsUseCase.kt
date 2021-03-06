package com.haurbano.domain.usecases

import com.haurbano.domain.common.Resource
import com.haurbano.domain.models.ProductDetails
import com.haurbano.domain.respositories.ProductsRepository

class GetProductDetailsUseCase(
    private val productsRepository: ProductsRepository
) {
    suspend operator fun invoke(productId: String): Resource<ProductDetails> {
        return productsRepository.getProductDetails(productId)
    }
}