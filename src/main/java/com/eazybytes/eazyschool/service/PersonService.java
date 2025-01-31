package com.eazybytes.eazyschool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eazybytes.eazyschool.model.Person;
import com.eazybytes.eazyschool.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
