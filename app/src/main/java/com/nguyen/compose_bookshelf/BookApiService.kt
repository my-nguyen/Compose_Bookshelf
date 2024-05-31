package com.nguyen.compose_bookshelf

import retrofit2.http.GET
import retrofit2.http.Query

interface BookApiService {
    @GET("volumes")
    suspend fun fetchBooks(@Query("q") query: String): BookData
}