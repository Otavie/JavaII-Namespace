//File: src/com/school/cu/CUStudent.java

package com.school.cu;

import com.school.unilag.UnilagStudent;

public class CUStudent {
    private String name;
    public String level;

    public void showInfo() {
        UnilagStudent unilagStudent = new UnilagStudent();
        unilagStudent.displayDetails();
    }
}
