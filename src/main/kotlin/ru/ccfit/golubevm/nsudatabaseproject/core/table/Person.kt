package ru.ccfit.golubevm.nsudatabaseproject.core.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table(name = "person")
data class Person(
    @Id
    @Column("person_id")
    val personId: Int? = null,

    @Column("person_name")
    val personName: String,

    @Column("date_of_birth")
    val dateOfBirth: LocalDate,

    @Column("date_of_death")
    val dateOfDeath: LocalDate? = null,

    @Column("citizenship")
    val citizenship: String? = null,

    @Column("place_of_birth")
    val placeOfBirth: String? = null
)

