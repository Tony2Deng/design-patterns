package com.tony.structure.filter.criteria;

import com.tony.structure.filter.pojo.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> list);
}
