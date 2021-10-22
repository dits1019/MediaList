package com.example.MediaList

import com.example.MediaList.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "7dac146b5390123d5d5b2665f0c5e8d6",
        @Query("page") page: Int
    ) : Call<GetMoviesResponse>
}