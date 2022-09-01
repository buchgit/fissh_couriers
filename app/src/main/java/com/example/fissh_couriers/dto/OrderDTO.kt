package com.example.fissh_couriers.dto

import java.io.Serializable

//Create data transfer object
//Convert to Order

//{
//    "items": [
//    {
//        "number": "803070",
//        "status": "N",
//        "delivery_type": "pickup",
//        "deadline": "2022-06-30 21:30:00",
//        "expected_receipt_time": "2022-06-30 23:30:00",
//        "arrival_time": "2022-06-30 20:00:00",
//        "person_quantity": 1,
//        "comment": "Взболтать, но не перемешивать",
//        "payment_type": "онлайн",
//        "customer_name": "Иванов Иван Иванович",
//        "customer_address": "г Санкт-Петербург, ул. Садовая, 123",
//        "customer_phone": "+7 (999) 999-99-99",
//        "store_code": "00-0000001",
//        "basket": [
//        "159587"
//        ]
//    }
//    ]
//}


class OrderDTO : Serializable{
    lateinit var number: String





}
