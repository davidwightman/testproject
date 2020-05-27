package org.davidwightman.testproject.dao;


import org.davidwightman.testproject.model.Person;

import java.util.UUID;

public class FakePersonAccessService implements PersonDao {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }
}
