package com.nguyen.compose_bookshelf

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface BookState {
    data class Success(val books: List<Item>) : BookState
    object Error : BookState
    object Loading : BookState
}

class BookViewModel(private val repository: BookRepository) : ViewModel() {
    var bookState: BookState by mutableStateOf(BookState.Loading)
        private set

    init {
        viewModelScope.launch {
            bookState = try {
                // val query = "flowers+inauthor:keyes"
                val query = "pride+prejudice"
                val result = repository.fetchBooks(query)
                BookState.Success(result.items)
            } catch (e: IOException) {
                BookState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BookApplication)
                BookViewModel(repository = application.container.repository)
            }
        }
    }
}