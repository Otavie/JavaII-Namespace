package com.example.main;
import com.example.access.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new Student("James Bliz", 23, "0000");
        st.showInfo();
        st.showStudentInfo();
    }
}
