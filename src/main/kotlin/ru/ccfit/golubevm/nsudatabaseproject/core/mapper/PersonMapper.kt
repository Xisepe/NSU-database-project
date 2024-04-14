package ru.ccfit.golubevm.nsudatabaseproject.core.mapper

import org.mapstruct.Mapper
import ru.ccfit.golubevm.nsudatabaseproject.api.dto.PersonDto
import ru.ccfit.golubevm.nsudatabaseproject.api.request.CreatePersonRequest
import ru.ccfit.golubevm.nsudatabaseproject.core.table.Person
@Mapper
interface PersonMapper {
    fun requestToBean(createPersonRequest: CreatePersonRequest): Person
    fun toDto(person: Person): PersonDto
    fun toBean(personDto: PersonDto): Person
}