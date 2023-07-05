/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author Hp
 */
import DTO.Student;
import factory.StudentDALFactory;
import java.util.ArrayList;
import java.util.List;

public class StudentDAL {
    private final List<Student> students;

    public StudentDAL() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }
    
    StudentDAL studentDAL = StudentDALFactory.createStudentDAL();
}
