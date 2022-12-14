package com.raywenderlich.android.cocktails.game.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.raywenderlich.android.cocktails.common.repository.Repository
import com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory

class CocktailsGameViewModelFactory(
    private val repository: Repository,
    private val gameFactory: CocktailsGameFactory
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CocktailsGameViewModel(repository, gameFactory) as T
    }
}