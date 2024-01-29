package com.tony.structure.filter.criteria.impl.logic;

import com.tony.structure.filter.criteria.Criteria;
import com.tony.structure.filter.pojo.Person;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        return criteria.meetCriteria(otherCriteria.meetCriteria(list));
    }
}
