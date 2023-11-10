package net.JavaProject.sms.service;

import lombok.Getter;
import lombok.Setter;
import net.JavaProject.sms.entity.Student;

import java.util.List;



public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);


}
