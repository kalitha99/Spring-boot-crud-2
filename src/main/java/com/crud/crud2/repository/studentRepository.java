package com.crud.crud2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.crud2.model.student;
@Repository
public interface studentRepository extends JpaRepository<student,Integer> {

}
