package cn.lnfvc.spring_test.dao;

import cn.lnfvc.spring_test.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
