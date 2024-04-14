package ru.ccfit.golubevm.nsudatabaseproject.core.service

import ru.ccfit.golubevm.nsudatabaseproject.api.dto.PersonDto
import ru.ccfit.golubevm.nsudatabaseproject.api.request.CreatePersonRequest

interface PersonService{
    fun createPerson(createPersonRequest: CreatePersonRequest): PersonDto
    fun updatePerson(personDto: PersonDto): PersonDto
    fun deletePerson(personId: Int)
    fun getPerson(personId: Int): PersonDto
}