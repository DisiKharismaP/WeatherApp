package disiiy.khaper.weatherapp.service

import disiiy.khaper.weatherapp.model.ResponseWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET ("weather?")
    fun getWeather(
        @Query ("q") name : String?,
        @Query ("appid") apikey : String?
    ): retrofit2.Call<ResponseWeather>
}