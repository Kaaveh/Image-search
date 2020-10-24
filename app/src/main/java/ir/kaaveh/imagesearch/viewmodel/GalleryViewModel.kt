package ir.kaaveh.imagesearch.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import ir.kaaveh.imagesearch.repository.UnsplashRepository

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) :
    ViewModel() {

}