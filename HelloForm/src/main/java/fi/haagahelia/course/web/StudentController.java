package fi.haagahelia.course.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import fi.haagahelia.course.domain.Message;
import fi.haagahelia.course.domain.Student;

@Controller
public class StudentController {

    @GetMapping("/studentlists")
    public String hello(Model model) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        student1.setFirstName("Kate");
        student1.setLastName("Cole");
        students.add(student1);

        Student student2 = new Student();
        student2.setFirstName("Dan");
        student2.setLastName("Brown");
        students.add(student2);

        Student student3 = new Student();
        student3.setFirstName("Mike");
        student3.setLastName("Mars");
        students.add(student3);

        model.addAttribute("students", students);
        return "viestinsyotto";
    }

}
