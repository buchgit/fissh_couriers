package com.example.fissh_couriers.api

import com.example.fissh_couriers.dto.OrderDTO
import retrofit2.http.GET
import retrofit2.http.POST

interface CourierApi {
    //TODO нужно каждому методу персонально определять Handler с разной авторизацией. Из ретрофита убирать клиента с авторизацией через токен.

    @POST("api/v1/order")
    suspend fun getAllOrders():List<OrderDTO>
//    @GET("rest/user/nomenclature/all?email=user@gmail.com")
//    suspend fun getAllNomenclature(): List<PriceTable>
//
//    @GET("rest/user/personal/nomenclature/collection/{id}")
//    suspend fun getPersonalNomenclatureListByCollection(@Header(value = "Authorization") token: String,@Path("id") id: String): List<PriceTable>
//
//    @GET("rest/user/nomenclature/all?email=user@gmail.com")
//    suspend fun getNomenclatureList(): List<NomenclatureCollection>
//
//    @GET("rest/user/category/all")
//    suspend fun getAllCategory(): List<Category>
//
//    @GET("rest/user/collection/category/{id}")
//    suspend fun getCollectionByCategory(@Path("id") id: String): List<NomenclatureCollection>
//
//    @GET("rest/user/nomenclature/collection/{id}")
//    suspend fun getNomenclatureByCollection(@Path("id") id: String): List<Nomenclature>
//
//    @GET("rest/user/partner/all")
//    suspend fun getAllPartner(): List<Partner>
//
//    @POST("rest/user/auth")
//    suspend fun login(@Body login: LoginBody): ServerToken
//
//    @POST("rest/user/refresh")
//    suspend fun refreshToken(@Header(value = "Authorization") token: String): ServerToken
//
//    @POST("rest/user/order/create")
//    suspend fun saveOrderOnServer(@Header(value = "Authorization") token: String, @Body order:Order):String
//
//    @GET("rest/user/order/all")
//    suspend fun getPersonalOrderList(@Header(value = "Authorization") token: String): List<Order>
//
//    suspend fun register(@Body login: LoginBody): Boolean
}