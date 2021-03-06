package com.example.android_testing_commons

import com.haurbano.remotedatasource.models.FeaturesAndDescriptionResponse
import com.haurbano.remotedatasource.models.GetProductResponse
import com.haurbano.remotedatasource.models.ProductsSearchResponse
import com.haurbano.remotedatasource.models.SearchResult
import com.haurbano.testing_commons.MocksFactory

class AndroidMocksFactory(
    private val mocksFactory: MocksFactory
) {
    fun <T> createObject(clazz: Class<T>): T {
        return when(clazz) {
            ProductsSearchResponse::class.java -> getProductSearchResponse() as T
            GetProductResponse::class.java -> getProductDetailsResponse() as T
            FeaturesAndDescriptionResponse::class.java -> getFeaturesAndDescriptionResponse() as T
            else -> mocksFactory.createObject(clazz)
        }
    }

    private fun getFeaturesAndDescriptionResponse(): FeaturesAndDescriptionResponse {
        return FeaturesAndDescriptionResponse(
            id = "id",
            main_features = emptyList(),
            short_description = FeaturesAndDescriptionResponse.ShortDescription("","")
        )
    }

    private fun getProductDetailsResponse(): GetProductResponse {
        return GetProductResponse(
            price = 30000f,
            warranty = "1 Year",
            title = "My Mock Product",
            id = "id",
            condition = "new",
            available_quantity = 3,
            base_price = 27000.toFloat(),
            category_id = "category",
            currency_id = "COP",
            initial_quantity = 1,
            original_price = 35000,
            permalink = "url",
            pictures = emptyList(),
            secure_thumbnail = "https:url",
            sold_quantity = 23,
            thumbnail = "http:url",
            catalog_product_id = "MLA32SDL34"
        )
    }

    private fun getProductSearchResponse(): ProductsSearchResponse {
        return ProductsSearchResponse(
            available_sorts = emptyList(),
            available_filters = emptyList(),
            filters = emptyList(),
            paging = ProductsSearchResponse.Paging(),
            query = "Query",
            related_results = emptyList(),
            results = listOf(getSearchResultWithHttpUrl(), getSearchResultWithHttpsUrl()),
            secondary_results = emptyList(),
            site_id = "MCO",
            sort = ProductsSearchResponse.Sort()
        )
    }

    private fun getSearchResultWithHttpUrl(): SearchResult {
        return SearchResult(
            thumbnail = "http:url",
            sold_quantity = 23,
            permalink = "ProductLink",
            original_price = 23000,
            currency_id = "COP",
            category_id = "Things",
            available_quantity = 2,
            condition = "New",
            id = "id",
            title = "My product",
            price = 23000f,
            attributes = emptyList(),
            buying_mode = "Online",
            seller = SearchResult.Seller()
        )
    }

    private fun getSearchResultWithHttpsUrl(): SearchResult {
        return SearchResult(
            thumbnail = "https:url",
            sold_quantity = 23,
            permalink = "ProductLink",
            original_price = 24000,
            currency_id = "COP",
            category_id = "Things",
            available_quantity = 2,
            condition = "New",
            id = "id2",
            title = "My product 2",
            price = 24000f,
            attributes = emptyList(),
            buying_mode = "Online",
            seller = SearchResult.Seller()
        )
    }
}