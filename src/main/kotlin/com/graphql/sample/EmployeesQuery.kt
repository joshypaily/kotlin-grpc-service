package com.graphql.sample

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class EmployeesQuery: Query {
    fun employeesList() = listOf(
        Employee(
            id = 1,
            name = "Joshy",
            mobile = "9989898989",
            address = Address(houseName = "Abc house", street = "Kochi")
        ),Employee(
            id = 2,
            name = "Manu",
            mobile = "7789898989",
            address = Address(houseName = "Xyz house", street = "Ekm")
        )
    )
}

data class Employee(
    @Deprecated("Use id")
    val eid: Int? =null,
    val id: Int,
    val name: String,
    val mobile: String?,
    val address: Address?
)
data class Address(val houseName: String, val street: String)