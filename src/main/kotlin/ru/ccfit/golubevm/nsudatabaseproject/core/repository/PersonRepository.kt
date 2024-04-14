package ru.ccfit.golubevm.nsudatabaseproject.core.repository

import org.springframework.data.repository.CrudRepository
import ru.ccfit.golubevm.nsudatabaseproject.core.table.Person

interface PersonRepository : CrudRepository<Person, Int>