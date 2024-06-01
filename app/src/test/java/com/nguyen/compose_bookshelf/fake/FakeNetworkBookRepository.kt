package com.nguyen.compose_bookshelf.fake

import com.nguyen.compose_bookshelf.BookData
import com.nguyen.compose_bookshelf.BookRepository

class FakeNetworkBookRepository : BookRepository {
    override suspend fun fetchBooks(query: String): BookData = FakeDataSource.books
}