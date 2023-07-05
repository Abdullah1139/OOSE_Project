/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import DAL.StudentDAL;

/**
 *
 * @author Hp
 */
public class StudentDALFactory {
    public static StudentDAL createStudentDAL() {
        return new StudentDAL();
    }
}
