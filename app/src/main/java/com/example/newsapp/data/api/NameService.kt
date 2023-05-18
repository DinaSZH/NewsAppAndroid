package com.example.newsapp.data.api


import retrofit2.http.GET
import retrofit2.http.Query

interface NameService {

    @GET("/?name[]=michael&name[]=matthew&name[]=jane&name[]=dina&name[]=akzhunis&name[]=aigerim&name[]=mina&name[]=olzhas&name[]=kuba&name[]=beka")
    suspend fun getEverything(
        @retrofit2.http.Query("q") query: String,
        @retrofit2.http.Query("page") page:Int =1
    )

    suspend fun getHeadline(
        @Query("country_id") countryCode: String = "usa",
        @Query("probability") probability: Int = 1
    )
}