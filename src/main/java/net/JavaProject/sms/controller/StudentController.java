package net.JavaProject.sms.controller;

import lombok.AllArgsConstructor;
import net.JavaProject.sms.entity.Student;
import net.JavaProject.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@Controller
public class StudentController {

    private StudentService studentService;

    //Build REST API
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    //Build Api POST API
    @GetMapping("/students/new")
    public String createStudentForm( Model model){

        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public  String updateStudent(@PathVariable Long id , @ModelAttribute("student") Student student, Model model){

            Student existingStudent= studentService.getStudentById(id);

            existingStudent.setId(id);
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setEmail(student.getEmail());

            studentService.updateStudent(existingStudent);
            return "redirect:/students";
        }


    @GetMapping("/students/{id}")
    public String deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
