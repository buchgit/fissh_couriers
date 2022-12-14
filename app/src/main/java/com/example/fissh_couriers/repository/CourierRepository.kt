package com.example.fissh_couriers.repository

import com.example.fissh_couriers.api.CourierApi
import com.example.fissh_couriers.dto.OrderDTO
import com.example.fissh_couriers.model.sharedPreferences.AppSharedPreferences
import javax.inject.Inject

class CourierRepository @Inject constructor(
    private  val courierApi: CourierApi
): BaseRepository() {

    suspend fun getAllOrders(): Resource<List<OrderDTO>> {
        return safeApiCall { courierApi.getAllOrders() }
    }

}