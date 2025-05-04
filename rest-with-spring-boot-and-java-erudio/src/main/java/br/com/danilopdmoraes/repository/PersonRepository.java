package br.com.danilopdmoraes.repository;

import br.com.danilopdmoraes.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
