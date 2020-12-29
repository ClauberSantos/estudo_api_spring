package com.clauber.estudo01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.clauber.estudo01.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {


}
