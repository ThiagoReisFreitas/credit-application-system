package me.dio.creditapplicationsystem.service

import me.dio.creditapplicationsystem.entity.Credit
import java.util.UUID

interface ICreditService {

    fun save(credit: Credit): Credit

    fun findAlByCustomer(customerId: Long): List<Credit>

    fun findByCreditCode(customerId:Long, creditCode: UUID): Credit
}