package ru.ccfit.golubevm.nsudatabaseproject.core.controller

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ccfit.golubevm.nsudatabaseproject.api.dto.PersonDto
import ru.ccfit.golubevm.nsudatabaseproject.api.request.CreatePersonRequest
import ru.ccfit.golubevm.nsudatabaseproject.core.service.PersonService

@RestController
@RequestMapping("/api/person")
class PersonController(
    val personService: PersonService
) {
    @GetMapping("/{id}")
    fun getPerson(@PathVariable id: Int): PersonDto =
        personService.getPerson(id)
    @PostMapping
    fun createPerson(@RequestBody @Valid createPersonRequest: CreatePersonRequest): PersonDto =
        personService.createPerson(createPersonRequest)

    @PutMapping
    fun updatePerson(@RequestBody @Valid personDto: PersonDto): PersonDto =
        personService.updatePerson(personDto)

    @DeleteMapping("/{id}")
    fun deletePerson(@PathVariable id: Int) = personService.deletePerson(id)
}