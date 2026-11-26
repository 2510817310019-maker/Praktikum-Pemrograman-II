package com.example.module06;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    private void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Muhammad Hamdani", "2510817310019"),
                new Student(2, "Rafly Daryono", "2510817210018"),
                new Student(3, "jia iqlas al-fasa", "2510817320019"),
                new Student(4, "Muhammad Maulidan", "2510817310014"),
                new Student(5, "Khairurazzikin", "2510817110012"),
                new Student(6, "Abdul Ghani", "2510817110008"),
                new Student(7, "Sodri romanda", "24181731019"),
                new Student(8, "Dhio Pradana", "2510817310019"),
                new Student(9, "Farid Wajdi", "2510817310001"),
                new Student(10, "Al Farid", "2510817110004")

        );

        studentTable.setItems(studentList);
    }
}