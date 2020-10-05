package id.rafif.beritaapp.api.service

import id.rafif.beritaapp.model.remote.ResponseNews
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Imam Fahrur Rofi on 29/05/2020.
 */
interface TopHeadlines {
    @GET("/v2/top-headlines")
    fun fetchHeadlines(@Query("country") country: String, @Query("category") category: String): Call<ResponseNews>
}