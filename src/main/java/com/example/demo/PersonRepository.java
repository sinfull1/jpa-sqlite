package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // You can define custom query methods here if needed
}

