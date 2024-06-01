package com.nguyen.compose_bookshelf

import com.nguyen.compose_bookshelf.fake.FakeBookApiService
import com.nguyen.compose_bookshelf.fake.FakeDataSource
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.Assert.assertEquals

class NetworkBookRepositoryTest {
    @Test
    fun networkBookRepositoryTest_getBooks_verifyBooks() = runTest {
        val repository = NetworkBookRepository(service = FakeBookApiService())
        assertEquals(FakeDataSource.books, repository.fetchBooks("blah"))
    }
}