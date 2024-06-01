package com.nguyen.compose_bookshelf.fake

import com.nguyen.compose_bookshelf.BookApiService
import com.nguyen.compose_bookshelf.BookData

class FakeBookApiService : BookApiService {
    override suspend fun fetchBooks(query: String): BookData = FakeDataSource.books
}