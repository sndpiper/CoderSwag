package com.mediasyncnow.coderswag.Services

import com.mediasyncnow.coderswag.Model.Category
import com.mediasyncnow.coderswag.Model.Product

/**
 * Created by sandpiper on 22/2/18.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphics Beanie ", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$22", "hat03"),
            Product("Devslopes Hat Snapback", "$19", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$30", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$22", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$20", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip Studies", "$18", "shirt05")
    )
}