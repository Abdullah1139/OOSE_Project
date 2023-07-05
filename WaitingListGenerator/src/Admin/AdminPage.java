/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
/**
 *
 * @author Hp
 */
import DTO.Student;
import GenerateWaitingList.WaitingListGenerator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class AdminPage {
    public static void main(String[] args) {
        List<Student> qualifiedStudents = new ArrayList<>();
        qualifiedStudents.add(new Student("Ali", 90));
        qualifiedStudents.add(new Student("Ahmed", 85));
        qualifiedStudents.add(new Student("Shameer", 92));
        qualifiedStudents.add(new Student("Furqan", 88));

        WaitingListGenerator generator = new WaitingListGenerator(qualifiedStudents);

        SwingUtilities.invokeLater(() -> {
            createAndShowGUI(generator);
        });
    }

    private static void createAndShowGUI(WaitingListGenerator generator) {
        JFrame frame = new JFrame("Admin Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        // GRASP Principle: Controller
        // The AdminPage class handles system events and coordinates activities.
        JMenuItem generateWaitingListMenuItem = new JMenuItem("Generate Waiting List");
        generateWaitingListMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generator.generateWaitingList();
                List<Student> waitingList = generator.getWaitingList();
                showWaitingList(waitingList);
            }
        });

        // Add additional menu items
        JMenuItem generateMeritListMenuItem = new JMenuItem("Generate Merit List");
        JMenuItem setWelcomeScheduleMenuItem = new JMenuItem("Set Welcome Schedule");
        JMenuItem generateAdmissionChallanMenuItem = new JMenuItem("Generate Admission Challan");
        JMenuItem logoutMenuItem = new JMenuItem("Logout");

        menu.add(generateWaitingListMenuItem);
        menu.add(generateMeritListMenuItem);
        menu.add(setWelcomeScheduleMenuItem);
        menu.add(generateAdmissionChallanMenuItem);
        menu.add(logoutMenuItem);

        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(500, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

  private static void showWaitingList(List<Student> waitingList) {
    JFrame frame = new JFrame("Waiting List");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLUE);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JLabel titleLabel = new JLabel("Waiting List");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
    titleLabel.setForeground(Color.WHITE);
    titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    panel.add(titleLabel);
    panel.add(Box.createVerticalStrut(10));

    for (Student student : waitingList) {
        JLabel studentLabel = new JLabel(student.getName());
        studentLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        studentLabel.setForeground(Color.BLACK); // Set the foreground color to dark black
        studentLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(studentLabel);
    }

    frame.add(panel, BorderLayout.CENTER);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}
}
