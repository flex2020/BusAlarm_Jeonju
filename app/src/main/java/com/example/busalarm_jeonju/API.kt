package com.example.busalarm_jeonju

import retrofit2.http.GET
import retrofit2.http.Query

interface API {
    @GET("")
    suspend fun getData(
        @Query("ServiceKey")
        ServiceKey:String = "UCK3jCFOxX7Hhb6syYjdncwR2q6N78CMrvLaGvb%2FNO2NKlYAwtH4rQ6sOYgzwOIk7Z0XnTqNjplKo16JGKq55Q%3D%3D",
        @Query("brtS")
    )
}