package com.crud.crud2.services;


import com.crud.crud2.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.crud2.model.student;

import java.util.List;
import java.util.Optional;

@Service
public class studentservicesimplimentation implements studentservice {
    @Autowired
    private studentRepository studentRepository;

    @Override
    public student saveStudent(student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public student findId (Integer id)  {
        Optional<student> result = studentRepository.findById(id);

        return result.get();


    }

    @Override
    public student deleteuser (Integer id)  {
        studentRepository.deleteById(id);
        return null;



    }

}
