package ir.kaaveh.imagesearch.repository.network

import ir.kaaveh.imagesearch.model.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)