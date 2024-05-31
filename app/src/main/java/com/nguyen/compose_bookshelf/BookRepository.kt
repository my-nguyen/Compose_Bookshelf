package com.nguyen.compose_bookshelf

interface BookRepository {
    suspend fun fetchBooks(query: String): BookData
}

class NetworkBookRepository(private val service: BookApiService) : BookRepository {
    override suspend fun fetchBooks(query: String): BookData = service.fetchBooks(query)
}