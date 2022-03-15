package com.crud.crud2.services;
import com.crud.crud2.model.student;

import java.util.List;

public interface studentservice {
    public student  saveStudent(student student);
    public List<student> getAllStudents();
    public student findId(Integer id);

    student deleteuser(Integer id);
}
