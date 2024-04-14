package ru.ccfit.golubevm.nsudatabaseproject.core.table

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
@Table(name = "title")
data class Title(
    @Id
    val id: Int? = null,

    @Column("name")
    val name: String,

    @Column("original_name")
    val originalName: String? = null,

    @Column("tagline")
    val tagline: String? = null,

    @Column("duration")
    val duration: Int? = null,

    @Column("budget")
    val budget: Int? = null,

    @Column("release_date")
    val releaseDate: LocalDate? = null,

    @Column("age_constraint")
    val ageConstraint: Int? = null,

    @Enumerated(EnumType.STRING)
    @Column("mpa_rating")
    val mpaRating: MpaRating? = null,

    val country: Country? = null
)
