package com.nguyen.compose_bookshelf

import com.nguyen.compose_bookshelf.fake.FakeDataSource
import com.nguyen.compose_bookshelf.fake.FakeNetworkBookRepository
import com.nguyen.compose_bookshelf.rules.TestDispatcherRule
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class BookViewModelTest {
    @get:Rule
    val rule = TestDispatcherRule()

    @Test
    fun bookViewModel_getBooks_verifyBookStateSuccess() = runTest {
        val viewModel = BookViewModel(repository = FakeNetworkBookRepository())
        assertEquals(BookState.Success(FakeDataSource.books.items), viewModel.bookState)
    }
}