package dev.augusto.aulajparepository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import dev.augusto.aulajparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);
	Page<User> findByNameContainsIgnoreCase(String name, Pageable pageable);

}
