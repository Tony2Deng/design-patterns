package com.tony.structure.filter.criteria.impl.logic;

import com.tony.structure.filter.criteria.Criteria;
import com.tony.structure.filter.pojo.Person;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }


    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> result = this.criteria.meetCriteria(list);
        List<Person> people = otherCriteria.meetCriteria(list);
        people.forEach(person -> {
            if (!result.contains(person)) {
                result.add(person);
            }
        });
        return result;
    }
}
