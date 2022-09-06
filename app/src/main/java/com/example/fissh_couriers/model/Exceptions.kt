package com.example.fissh_couriers.model

class Exceptions {

    open class AppException:RuntimeException{
        constructor():super()
        constructor(message:String):super(message)
        constructor(cause:Throwable):super(cause)
    }

}