package com.tony.structure.filter.criteria.impl;

import com.tony.structure.filter.criteria.Criteria;
import com.tony.structure.filter.pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> list) {
        ArrayList<Person> result = new ArrayList<>();
        list.forEach(person -> {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                result.add(person);
            }
        });
        return result;
    }
}
