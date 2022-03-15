package com.crud.crud2.controller;
import com.crud.crud2.model.student;
import com.crud.crud2.services.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class studentcontroller {
    @Autowired
    private studentservice studentservice;

    @PostMapping("/add")
    public String add(@RequestBody student student) {
        studentservice.saveStudent(student);
        return "new student added";

    }

    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Integer id) {
        return studentservice.findId(id);
    }

    @PutMapping("/update")
    public  String updatestd(@RequestBody student student) {

        studentservice.saveStudent(student);
        return "updated";
    }

    @GetMapping("/getAll")
    public List<student> getAllStudents(){
        return studentservice.getAllStudents();

    }

    @DeleteMapping("/{id}")
    public String deleteuser(@PathVariable("id") Integer id) {
        studentservice.deleteuser(id);

        return "deleted";

    }
}
