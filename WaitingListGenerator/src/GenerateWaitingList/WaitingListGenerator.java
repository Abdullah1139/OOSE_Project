/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GenerateWaitingList;

/**
 *
 * @author Hp
 */
// WaitingListGenerator.java - Controller class responsible for generating the waiting list

import DTO.Student;
import java.util.ArrayList;
import java.util.List;

// GRASP Principle: Creator
// The WaitingListGenerator class is responsible for creating and managing the waiting list.
public class WaitingListGenerator {
    private List<Student> qualifiedStudents;
    private List<Student> waitingList;

    public WaitingListGenerator(List<Student> qualifiedStudents) {
        this.qualifiedStudents = qualifiedStudents;
        this.waitingList = new ArrayList<>();
    }

    // GRASP Principle: Information Expert
    // The WaitingListGenerator has the necessary information (qualified students) to generate the waiting list.
    public void generateWaitingList() {
        qualifiedStudents.sort((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
        waitingList.addAll(qualifiedStudents);
    }

    public List<Student> getWaitingList() {
        return waitingList;
    }
    
}