package com.korbacsk.movies.config

import com.bumptech.glide.load.engine.DiskCacheStrategy

object Config {

    const val MOVIE_API_KEY: String = "c3e37ee7c326836b6cc05924d2dca9fc"
    const val MOVIE_API_BASE_URL: String = "https://api.themoviedb.org/3/"
    const val MOVIE_API_IMAGE_URL_POSTER: String = "https://image.tmdb.org/t/p/w342"
    const val MOVIE_API_IMAGE_URL_BACKDROP: String = "https://image.tmdb.org/t/p/w1280"

    val GLIDE_DISK_CACHE_STRATEGY: DiskCacheStrategy = DiskCacheStrategy.ALL

    const val MOVIE_API_MOVIES: String = "movie/top_rated"
}