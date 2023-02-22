package com.dada.classesspringbootangular.repositories;


import com.dada.classesspringbootangular.models.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {
}
