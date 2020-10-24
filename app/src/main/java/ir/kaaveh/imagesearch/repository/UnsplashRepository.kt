package ir.kaaveh.imagesearch.repository

import ir.kaaveh.imagesearch.repository.network.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {

}