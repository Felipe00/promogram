package io.felipe.promogram

import java.util.*

/**
 * Created by felipe on 15/04/18.
 */
data class Promo(val id: Long,
                 val product: String,
                 val discountPrice: Double,
                 val realPrice: Double,
                 val enterprise: String,
                 val validUntil: String,
                 val photo: Int) {
}