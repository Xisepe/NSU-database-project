package ru.ccfit.golubevm.nsudatabaseproject.core.service

import org.springframework.stereotype.Service
import ru.ccfit.golubevm.nsudatabaseproject.api.dto.PersonDto
import ru.ccfit.golubevm.nsudatabaseproject.api.request.CreatePersonRequest
import ru.ccfit.golubevm.nsudatabaseproject.core.mapper.PersonMapper
import ru.ccfit.golubevm.nsudatabaseproject.core.repository.PersonRepository
import java.util.NoSuchElementException

@Service
class PersonServiceImpl(
    val personRepository: PersonRepository,
    val personMapper: PersonMapper
) : PersonService {
    override fun createPerson(createPersonRequest: CreatePersonRequest): PersonDto {
        val saved = personRepository.save(
            personMapper.requestToBean(createPersonRequest)
        )
        return personMapper.toDto(saved)
    }

    override fun updatePerson(personDto: PersonDto): PersonDto {
        val person = personMapper.toBean(personDto)
        if (person.personId != null && !personRepository.existsById(person.personId))
            throw NoSuchElementException("No person with id: ${person.personId}")
        return personRepository.save(person).let {
            personMapper.toDto(it)
        }
    }

    override fun deletePerson(personId: Int) {
        personRepository.deleteById(personId)
    }

    override fun getPerson(personId: Int): PersonDto =
        personRepository.findById(personId)
            .orElseThrow()
            .let {
                personMapper.toDto(it)
            }


}