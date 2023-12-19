package com.example.fantasticten.utils

import com.example.fantasticten.data.ArtikelData
import com.example.fantasticten.data.ArtikelResponse
import com.example.fantasticten.data.RegisterBody
import com.example.fantasticten.data.AuthResponse

import com.example.fantasticten.data.DoctorResponse
import com.example.fantasticten.data.LoginBody

import com.example.fantasticten.data.ResponseRiwayat

import com.example.fantasticten.data.ProgramResponse
import com.example.fantasticten.data.QueueData

import com.example.fantasticten.data.UniqueEmailValidationResponse
import com.example.fantasticten.data.ValidateEmailBody
import com.example.fantasticten.data.editProfil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface APIComsumer {
    @POST("api/auth/validate-unique-email")
    suspend fun validateEmailAddress(@Body body: ValidateEmailBody): Response<UniqueEmailValidationResponse>

    @POST("api/auth/signup")
    suspend fun registerUser(@Body body: RegisterBody): Response<AuthResponse>

    @POST("api/auth/signin")
    suspend fun loginUser(@Body body: LoginBody): Response<AuthResponse>
    @GET("api/dokter")
    suspend fun getDoctors(): Response<DoctorResponse>
    @GET("api/program")
    suspend fun getPrograms(): Response<ProgramResponse>

    @GET("api/artic")
    suspend fun getartic(): Response<ArtikelResponse>
    @GET("api/artic/{id}")
    suspend fun getDetailArtikel(@Path("id") artikelId: String): Response<ArtikelData>


    @POST("/api/queue")
    fun addQueue(@Body queueData: QueueData): Call<Void>



    @Headers("Content-Type: application/json")
    @POST("api/get-riwayat-pasien/{id}")
    fun getPatientHistory(@Path("id") id: Int): Call<ResponseRiwayat>
    @PUT("/api/user/{id}")
    fun putUser(@Path("id")id: Int):Call<editProfil>
    @GET("/api/user/{id}")
    fun getUser(@Path("id")id: Int):Call<editProfil>

}